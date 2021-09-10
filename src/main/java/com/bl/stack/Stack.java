package com.bl.stack;

import com.bl.linkedlist.LinkedList;
import com.bl.linkedlist.Node;

public class Stack {
    private Node top;
    private LinkedList linkedList;

    public Stack() {
        this.linkedList = new LinkedList();
    }

    public void push() {
        linkedList.push(70);
        linkedList.push(30);
        top = linkedList.push(56);
        linkedList.print();
    }

    public int peek() {
        push();
        System.out.println("Top element is " + this.top.data);
        return this.top.data;
    }

    public void pop() {
        System.out.println("Before");
        push();
        Node temp = top;
        while (temp != null) {
            linkedList.popFirst();
            temp = temp.next;
        }
        System.out.println("After");
        linkedList.print();
    }
}
