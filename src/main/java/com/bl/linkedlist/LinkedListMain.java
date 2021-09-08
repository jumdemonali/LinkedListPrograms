package com.bl.linkedlist;
import java.util.Scanner;
public class LinkedListMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add element");
        System.out.println("Enter 2 to append element at start");
        switch(sc.nextInt()){
            case 1:
                Operations.addElementAtStart();
                break;
            case 2:
                Operations.appendElement();
                break;
        }
    }
}
