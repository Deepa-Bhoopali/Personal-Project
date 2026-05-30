package com.myfirstspring.learn_spring_framework.learnCollectionframework;

import java.util.ArrayDeque;

public class LearnArrayDeque {

    public static void main(String[] args) {

        ArrayDeque<String> deque = new ArrayDeque<>();

        // Adding elements to the front and back
        deque.addFirst("Task 1");
        deque.addLast("Task 2");
        deque.addFirst("Task 3");

        deque.offerFirst("Task 4"); // offerFirst() is similar to addFirst() but returns false if the deque is full
        deque.offerLast("Task 5"); // offerLast() is similar to addLast() but returns false if the deque is full

        System.out.println("Deque: " + deque);
        // Removing elements from the front and back
        String first = deque.removeFirst(); // Task 3 or deque.remove() is equivalent to removeFirst()
        String last = deque.removeLast(); // Task 2

        String removed = deque.pollFirst(); // Retrieves and removes the head of the deque, or returns null if empty
        // String peekRemoved = deque.peek(); // Retrieves the head of the deque without
        // removing it, or returns null if empty

        // Peeking at the front and back elements
        String peekFirst = deque.peekFirst(); // Task 1
        String peekLast = deque.peekLast(); // Task 2

        // Checking if the deque is empty
        boolean isEmpty = deque.isEmpty();

        // Printing the results
        System.out.println("Removed from front: " + first);
        System.out.println("Removed from back: " + last);
        System.out.println("Polled from front: " + removed);
        // System.out.println("Peeked element: " + peekRemoved);
        System.out.println("Peek front: " + peekFirst);
        System.out.println("Peek back: " + peekLast);
        System.out.println("Is deque empty? " + isEmpty);

        // Clearing the deque
        deque.clear();
        System.out.println("Deque after clear: " + deque);

        // ArrayDeque is a resizable array implementation of the Deque interface. It
        // allows you to add and remove elements from both ends of the deque
        // efficiently. Here are some key features and characteristics of ArrayDeque:
        // 1. Double-Ended Queue: ArrayDeque supports adding and removing elements from
        // both the front and back of the deque.
        // 2. Dynamic Size: The size of the ArrayDeque can grow or shrink dynamically as
        // elements are added or removed.
        // 3. No Capacity Restrictions: Unlike some other queue implementations,
        // ArrayDeque does not have a fixed capacity and can grow as needed.
        // 4. Use Cases: ArrayDeque is commonly used in scenarios such as implementing
        // stacks, queues, and deques, as well as in algorithms that require efficient
        // insertion and removal of elements from both ends.

    }

}
