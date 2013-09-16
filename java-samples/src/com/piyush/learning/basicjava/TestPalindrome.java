/*
 * TestPalindrome
 * Copyright (c) 2001-2006 MessageOne Inc.
 */
package com.piyush.learning.basicjava;

/**
 * @author piyush
 */
public class TestPalindrome {

    public static void main(String[] args) {

        String palindrome = "NITINB";

        System.out.println(isPalindrome(palindrome));
    }

    public static boolean isPalindrome(String word) {

        int len = word.length();
        System.out.println(len);

        for(int i = 0; i < len / 2; i++) {
            if(word.charAt(i) == word.charAt((len - 1)) + i) return true;
        }

        return false;

    }

}
