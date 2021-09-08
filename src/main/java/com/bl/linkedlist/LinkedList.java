package com.bl.linkedlist;

public class LinkedList {
    Node head;
    Node tail;
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
    }
    public void append(int data) {
        Node newnode=new Node(data);
        if (head == null)
        {
            this.head = newnode;
            this.tail = newnode;
        } else
        {
            Node temp=tail;
            this.tail=newnode;
            temp.next=tail;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked List is Empty");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+ " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}
