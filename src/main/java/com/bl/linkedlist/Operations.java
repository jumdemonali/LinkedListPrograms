package com.bl.linkedlist;

public class Operations {
    public static LinkedList addElementAtStart() {
        LinkedList linkedList = new LinkedList();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
        return linkedList;
    }

    public static void appendElement() {
        LinkedList linkedList = new LinkedList();
        linkedList.append(56);
        linkedList.append(30);
        linkedList.append(70);
        linkedList.print();
    }

    public static void insertInBetween() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(56);
        linkedList.insert(70);
        linkedList.insert(30);
        linkedList.print();
    }

    public static void deleteFirstNode() {
        LinkedList linkedList = addElementAtStart();
        linkedList.popFirst();
        linkedList.print();
    }

    public static void deleteLastNode() {
        LinkedList linkedList = addElementAtStart();
        linkedList.popLast();
        linkedList.print();

    }

    public static void findNodeBaseOnValue() {
        LinkedList linkedList = addElementAtStart();
        linkedList.searchNode(30);
    }

    public static LinkedList insertAfterSearchNode() {
        System.out.println("Before Insertion");
        LinkedList linkedList = addElementAtStart();
        Node newNode = new Node(40);
        Node previousNode = linkedList.insertAfter(30, newNode);
        System.out.println("After Insertion");
        linkedList.print();
        return linkedList;
    }

    public static void deleteSpecificNode() {
        System.out.println("Before deletion:");
        LinkedList linkedList = insertAfterSearchNode();
        System.out.println("After");
        linkedList.deleteNode(40);
        System.out.println("After deletion:");
        linkedList.print();
        int size = linkedList.size();
        System.out.println("Linked size is " + size);

    }

    public static void sortNode() {
        System.out.println("Before sorting");
        LinkedList linkedList = addElementAtStart();
        linkedList.sort();
        System.out.println("After sorting");
        linkedList.print();
    }
}


