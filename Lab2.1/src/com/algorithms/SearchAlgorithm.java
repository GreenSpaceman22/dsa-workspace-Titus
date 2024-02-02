package com.algorithms;

import java.util.Arrays;

public class SearchAlgorithm {

    public static int linearSearch(int needle, int[] haystack) {
        // TODO-Lab2.1.A: Implement Linear search logic.
        int result = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                result = i;
            }
        }
        return result;
    }

    public static int binarySearch(int needle, int[] haystack) {
        Arrays.sort(haystack);
        int tries = 1;
        int low = 0;
        int high = haystack.length - 1;

        while (low <= high) {
            int mid = low + (high -low) / 2;

            if (haystack[mid] == needle) {
                return mid;
            }
            else if (haystack[mid] < needle) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
            tries++;
        }
        System.out.println("It ain't in here, buddy");
        return -1;
        //  1,2,3,4,5,6,7,8,9,10
        //                  ^L^R
        // Lab2.1.B: Implement binary search logic here
        //  using iteration; include counter variable and print
        //  statements to show number of iterations.
    }

    // TODO-Lab2.1.C (optional): Modify binarySearch logic to use
    //  recursion, completing the method below, and
    //  modifying the method above to invoke the method below.
    //  For the recursive approach, don't bother counting
    //  the number of iterations/invocations.
    private static int binarySearch(int needle, int[] haystack, int low, int high) {

        if (low <= high) {
            int mid = low + (high -low) / 2;

            if (haystack[mid] == needle) {
                return mid;
            }
            if (haystack[mid] < needle) {
                return binarySearch(needle, haystack, mid + 1, high);
            }
            else {
                return binarySearch(needle, haystack, low, mid - 1);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // TODO-Lab2.1.A: Invoke linearSearch(int, int[]) method
        int needle = 7;
        int[] haystack = new int[] {1,2,3,4,5,6,7,8,9,10};
//        System.out.println(linearSearch(needle, haystack));
        System.out.println(binarySearch(needle, haystack));
        //  (and print the result) twice: once with a value actually

        //  present in the array, and once with a value not in the array.
        // TODO-Lab2.1.B: Invoke binarySearch(int, int[]) method
        //  (and print the result) twice: once with a value actually
        //  present in the array, and once with a value not in the array.
    }

}