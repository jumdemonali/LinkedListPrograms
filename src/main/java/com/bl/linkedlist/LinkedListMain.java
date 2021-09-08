package com.bl.linkedlist;
import java.util.Scanner;
public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add element \nEnter 2 to append element at start \nEnter 3 to insert element in between");
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
        }
    }
}
