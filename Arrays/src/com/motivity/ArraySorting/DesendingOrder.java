package com.motivity.ArraySorting;

import java.util.Arrays;
import java.util.Collections;

public class DesendingOrder {
    public static void main(String[] args) {
        Integer [] array = {23, -9, 78, 102, 4, 0, -1, 11, 6, 110, 205};
// sorts array[] in descending order
        Arrays.sort(array, Collections.reverseOrder());
        System.out.println("Array elements in descending order: " + Arrays.toString(array));
    }
}
