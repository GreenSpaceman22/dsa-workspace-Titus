package com.algorithms;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static com.algorithms.BubbleSort.sort;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class BubbleSortTest {

    // TODO-Lab2.2: Create test methods for bubble sort implementation.
    int[] array;
    int[] unsortedArray;
    int[] wackyArray;
    @Before
    public void setUp() {
        array = new int[]{1, 4, 6, 8, 9, 10, 12, 13, 23, 44};
        unsortedArray = new int[]{4,1,2,5,3};
        wackyArray = new int[]{1,2,3,9,8,7,6,5,4,1,1,1,1,};
    }
    @Test
    public void arrayShouldBeSorted_ifGiven_sortedArray(){
        sort(array);
        System.out.println(Arrays.toString(array));
        int[] expected = new int[]{1,4,6,8,9,10,12,13,23,44};
        assertArrayEquals(expected,array);
    }
    @Test
    public void arrayShouldBeSorted_ifGiven_unsortedArray(){
        sort(unsortedArray);
        System.out.println(Arrays.toString(unsortedArray));
        int[] expected = new int[]{1,2,3,4,5};
        assertArrayEquals(expected,unsortedArray);
    }
    @Test
    public void arrayShouldBeSorted_ifGiven_unsortedArrayWithDups(){
        sort(wackyArray);
        System.out.println(Arrays.toString(wackyArray));
        int[] expected = new int[]{1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertArrayEquals(expected,wackyArray);
    }

}