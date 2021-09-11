package com.bl.stack;

import java.util.*;

public class StackMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to add element in stack");
        System.out.println("Enter 2 to get top element of stack");
        System.out.println("Enter 3 to delete all element of stack");
        System.out.println("Enter 4 to add elements in queue");
        Stack stack = new Stack();

        switch (sc.nextInt()) {
            case 1:
                stack.push();
                break;
            case 2:
                stack.peek();
                break;
            case 3:
                stack.pop();
                break;
            case 4:
                stack.enqueue();
        }
    }
}