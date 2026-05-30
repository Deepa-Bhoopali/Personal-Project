package com.myfirstspring.learn_spring_framework.learnCollectionframework;

import java.util.Stack;

public class LearnStack {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Stack is a data structure that follows the Last In First Out (LIFO) principle.
        // It allows you to store and manipulate a collection of elements in a way that
        // the last element added is the first one to be removed. Here are some key
        // features and characteristics of Stack:

        // 1. LIFO Order: The last element added to the stack is the first one to be
        // removed.

        // 2. Push and Pop Operations: You can add elements to the stack using the push
        // operation and remove elements using the pop operation.

        // 3. Top Element: The top element of the stack is the most recently added
        // element.

        // 4. Dynamic Size: The size of the stack can grow or shrink dynamically as
        // elements are added or removed.

        // 5. Use Cases: Stacks are commonly used in scenarios such as function call
        // management, expression evaluation, undo/redo operations, and backtracking
        // algorithms.

    }


}
