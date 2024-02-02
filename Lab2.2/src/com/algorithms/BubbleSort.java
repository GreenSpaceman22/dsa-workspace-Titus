package com.algorithms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] input = {22, 15, 13, 9, 6, 3, 1, 2};
        // 15, 13, 9, 6, 3, 1, 22
        //                  i  j
        System.out.println("unsorted");
        System.out.println(Arrays.toString(input));
        sort(input);
        System.out.println("Sorted:");
        System.out.println(Arrays.toString(input));
    }

    public static void sort(int[] numbers) {
        int counter = 0;
        while (counter <= numbers.length) {
            for (int i = 0; i < numbers.length - 1; i++) {
                int j = i + 1;
                if (numbers[i] > numbers[j]) {
                    swap(numbers, i, j);
                    System.out.println("compared ints this many times: " + counter++);
                }
            }
            counter++;
//            System.out.println("looped: " + counter);
        }
    }


    public static void swap(int[] numbers, int i, int j){
        int smallerNum = numbers[j];
        Array.setInt(numbers, j, numbers[i]);
        Array.setInt(numbers, i, smallerNum);
    }

}
