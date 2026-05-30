package com.myfirstspring.learn_spring_framework.learnCollectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    public static void main(String[] args) {

           Queue<Integer> queue = new LinkedList<>();
            queue.offer(10);
            queue.offer(20);
            queue.add(30); // add() adds an element to the rear of the queue, throws an exception if the queue is full
            queue.offer(40); // offer() is similar to add() but returns false if the queue is full
            System.out.println("Queue: " + queue);
            System.out.println("Front element: " + queue.peek()); // peek() retrieves the front element without removing it
            System.out.println("Removed element: " + queue.poll()); // poll() retrieves and removes the front element, returns null if the queue is empty
            System.out.println("Queue after poll: " + queue);
            System.out.println("Removed element: " + queue.remove()); // remove() retrieves and removes the front element, throws an exception if the queue is empty
            System.out.println("Queue after remove: " + queue);



            System.out.println("Is queue empty? " + queue.isEmpty());
            queue.clear(); // clear() removes all elements from the queue
            System.out.println("Queue after clear: " + queue);

            // Queue is a data structure that follows the First In First Out (FIFO) principle.
            // It allows you to store and manipulate a collection of elements in a way that
            // the first element added is the first one to be removed. Here are some key
            // features and characteristics of Queue:
    
            // 1. FIFO Order: The first element added to the queue is the first one to be
            // removed.
    
            // 2. Enqueue and Dequeue Operations: You can add elements to the queue using
            // the enqueue operation and remove elements using the dequeue operation.
    
            // 3. Front and Rear: The front of the queue is where elements are removed, and
            // the rear is where elements are added.
    
            // 4. Dynamic Size: The size of the queue can grow or shrink dynamically as
            // elements are added or removed.
    
            // 5. Use Cases: Queues are commonly used in scenarios such as task scheduling,
            // breadth-first search algorithms, and handling requests in web servers.

    }

}
