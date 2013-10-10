/*
 * FindDuplicateElementArray
 * Copyright (c) 2001-2006 MessageOne Inc.
 */
package com.piyush.learning.datastructure.array;

import java.util.Arrays;

/**
 * @author piyush
 *         <p/>
 *         find if there are any duplicate element in an array
 */

public class FindDuplicateElementArray {

    public static void main(String[] args) {
        int arr[] = new int[]{5, 3, 2, 7, 9, 10, 1, 4, 44, 77, 8, 12, 21};

        checkForDuplicate(arr);
        checkForDuplicateSorted(arr);

    }

    /**
     * Comparing every array element to all the array elements and check if duplicate exists.
     *
     * @param arr
     */

    public static void checkForDuplicate(int arr[]) {

        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = i + 1; j < arr.length - 1; j++) {
                if(arr[i] == arr[j]) {
                    System.out.println("Duplicate Exist " + arr[i] + " equals " + arr[j]);
                    return;
                }

            }

        }
        System.out.println(" No duplicates ");

    }

    /**
     * Improved version by sorting the Array.
     */

    public static void checkForDuplicateSorted(int arr[]) {
        //sort the array
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1]) {
                System.out.println("Duplicate Exist " + arr[i] + " equals " + arr[i + 1]);
                return;

            }

        }

        System.out.println(" No duplicates ");

    }

    /**
     *
     * Given an array of n numbers.
     * Give an algorithm for finding the first element in the array which is repeated?
     *
     */

}
