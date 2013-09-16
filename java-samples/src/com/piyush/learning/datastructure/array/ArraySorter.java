/*
 * ArraySorter
 * Copyright (c) 2001-2006 MessageOne Inc.
 */
package com.piyush.learning.datastructure.array;

/**
 * @author piyush
 */
public class ArraySorter {

    public static void main(String[] args) {

        int arr[] = new int[]{5, 3, 2, 6, 9, 10, 1};
        for(int i : arr) {
            System.out.println("before " + i);
        }
        int[] arri = sortArray(arr);
        for(int i : arri) {
            System.out.println("after " + i);
        }

    }

    public static int[] sortArray(int[] arr) {

        for(int i = 0; i < arr.length; i++) {
            //assume the first element is the min
            int min = arr[0];

        }
        return arr;
    }
}
