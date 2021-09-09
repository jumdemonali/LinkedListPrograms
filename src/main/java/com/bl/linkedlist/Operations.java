package com.bl.linkedlist;

public class Operations {
    public static LinkedList addElementAtStart(){
        LinkedList linkedList= new LinkedList();
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

}
