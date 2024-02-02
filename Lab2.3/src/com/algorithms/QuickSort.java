package com.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {
    int counter = 0;

    public static void main(String args[]) {
        QuickSort quickSort = new QuickSort();
        int[] numbers = new int[]{4, 5, 33, 17, 3, 21, 1, 16};
        System.out.println(Arrays.toString(numbers));
        quickSort.sort(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public void sort(int[] numbers) {
        if (numbers != null) {
            sort(numbers, 0, numbers.length - 1);
        }
    }
//
//    private void printPartitions(int[] numbers, int pivot, int start, int end) {
//        for (int a = start; a < pivot; a++) {
//            System.out.print(numbers[a] + "_");
//        }
//        System.out.print("-" + numbers[pivot] + "-");
//        for (int a = pivot + 1; a <= end; a++) {
//            System.out.print(numbers[a] + "_");
//        }
//        System.out.println("\n");
//    }

    private void sort(int[] numbers, int start, int end) {
        if (start < end) {
            int chunk = partition(numbers, start, end);

            sort(numbers, start, chunk - 1);
            sort(numbers, chunk+1, end);
        }
    }

    private int partition(int[] numbers, int start, int end) {
        int pivot = numbers[end];
        int top = start -1;
        for (int i = start; i <= end; i++) {

            if (numbers[i] < pivot) {
                top++;
                swap(numbers, top, i);
                System.out.println("compared ints this many times: " + counter++);
            }
        }

        swap(numbers, top + 1, end);
        return top + 1;
    }

    public static void swap(int[] numbers, int i, int j){
        int smallerNum = numbers[j];
        Array.setInt(numbers, j, numbers[i]);
        Array.setInt(numbers, i, smallerNum);
    }

}
