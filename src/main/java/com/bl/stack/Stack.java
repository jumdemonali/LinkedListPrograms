package com.bl.stack;

import com.bl.linkedlist.LinkedList;
import com.bl.linkedlist.Node;

public class Stack {
    private Node top;
    private Node front;
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

    public void enqueue() {
        front = linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();

    }

    public void dequeue() {
        System.out.println("Before");
        enqueue();
        Node temp = front;
        while (temp != null)
        {
            linkedList.popFirst();
            temp=temp.next;
        }
        System.out.println("After");
        linkedList.print();
    }
}
