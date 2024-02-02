package com.algorithms;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.Arrays.binarySearch;

public class Intersection {

    public static void main(String args[]) {
        int[] a = {4, 7, 5, 2, 3};
        int[] b = {4, 2, 3, 9, 1};
        Intersection simpleIntersection = new Intersection();
        System.out.println("Normal");
        System.out.println(simpleIntersection.intersection(a, b));
        System.out.println("Faster");
        System.out.println(simpleIntersection.intersectionFast(a, b));
    }

    public Set<Integer> intersection(int[] a, int[] b) {
        Set<Integer> result = new HashSet<>();
        for (int x : a) {
            for (int y : b) {
                if (x == y) {
                    result.add(x);
                }
            }
        }
        return result;
    }

    public Set<Integer> intersectionFast(int[] a, int[] b) {
        // TODO-Lab1.4: Implement fast intersection logic here
        Set<Integer> result = new HashSet<>();
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0, j = 0; i < a.length && j < b.length; ) {
            int valueA = a[i];
            int valueB = b[j];
            if (valueA == valueB) {
                result.add(valueA);
                i++;
                j++;
            } else if (valueA < valueB) {
                i++;
            } else {
                j++;
            }
        }
        return result;
    }
}
