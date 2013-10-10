/*
 * StackImplementation
 * Copyright (c) 2001-2006 MessageOne Inc.
 */
package com.piyush.learning.datastructure.array;

/**
 * @author piyush
 */
public class StackImplementation {

    Node top;

    Node pop() {
        return null;
    }

}

class Node {

    Node next = null;
    int data;

    public Node(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node end = new Node(d);
        Node n = this;
        while(n.next != null) {
            n = n.next;
        }
        n.next = end;

    }

}
