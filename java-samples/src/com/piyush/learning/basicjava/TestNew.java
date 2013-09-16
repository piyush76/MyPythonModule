/*
 * TestNew
 * Copyright (c) 2001-2006 MessageOne Inc.
 */
package com.piyush.learning.basicjava;

/**
 * @author piyush
 */
public class TestNew {
    public static void main(String[] args) {
        TestNew n = null;
        TestNew m = null;
        System.out.println(n);
        System.out.println(m);
        n = new TestNew();
        System.out.println(n);
        m = n;
        System.out.println(m);
        n = new TestNew();
        System.out.println(n);
        System.out.println(m);
    }
}


