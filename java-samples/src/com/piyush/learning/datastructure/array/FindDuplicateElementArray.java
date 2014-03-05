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
        int arr[] = new int[]{5, 3, 2, 7, 9, 10, 2, 4, 3, 3, 3, 3, 3, 77, 8, 2, 21};

        checkForDuplicate(arr);
        checkForDuplicateSorted(arr);
        int i = countForMaximumAppeared(arr);
        System.out.println("Appeared " + i + " Times");
        int j = countForMaximumAppearedSorted(arr);
        System.out.println("Appeared sorted " + j + " Times");

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
     * Given an array of  numbers. Give an algorithm for finding the element which
     * appears maximum number of times in the array?
     */

    public static int countForMaximumAppeared(int arr[]) {

        int counter, max = 0;
        for(int i = 0; i < arr.length - 1; i++) {
            counter = 0;
            for(int j = 0; j < arr.length - 1; j++) {

                if(arr[i] == arr[j]) {
                    counter++;
                }
                if(counter > max) {
                    max = counter;
                }

            }

        }

        return max;
    }

    /**
     * improved by sorting the array first
     */

    public static int countForMaximumAppearedSorted(int arr[]) {

        int counter, max = 0;
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++) {
            counter = 0;
            if(arr[i] == arr[i + 1]) {
                counter++;
            }
            if(counter > max) {
                max = counter;
            }
        }
        return max;
    }

}
