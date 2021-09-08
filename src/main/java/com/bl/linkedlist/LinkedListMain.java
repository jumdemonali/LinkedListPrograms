package com.bl.linkedlist;
import java.util.Scanner;
public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add element \nEnter 2 to append element at start \nEnter 3 to insert element in between \nEnter 4 to delete first element \nEnter 5 to delete last element");
        switch(sc.nextInt()){
            case 1:
                Operations.addElementAtStart();
                break;
            case 2:
                Operations.appendElement();
                break;
            case 3:
                Operations.insertInBetween();
                break;
            case 4:
                Operations.deleteFirstNode();
                break;
            case 5:
                Operations.deleteLastNode();
                break;

        }
    }
}
