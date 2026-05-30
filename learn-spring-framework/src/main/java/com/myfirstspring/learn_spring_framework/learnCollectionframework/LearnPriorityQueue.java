package com.myfirstspring.learn_spring_framework.learnCollectionframework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQueue {

        public static void main(String[] args) {

            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder()); // By default, PriorityQueue in Java is a min-heap, which means that the smallest element has the highest priority and will be at the front of the queue. You can also create a max-heap by providing a custom comparator.
            priorityQueue.offer(30);
            priorityQueue.offer(10);
            priorityQueue.offer(20);
            priorityQueue.offer(40);
            priorityQueue.offer(100);
            priorityQueue.offer(50);

            System.out.println("Priority Queue: " + priorityQueue);
            System.out.println("Front element: " + priorityQueue.peek());
            System.out.println("Removed element: " + priorityQueue.poll()); // poll() retrieves and removes the front element, returns null if the queue is empty
            System.out.println("Priority Queue after poll: " + priorityQueue);
            System.out.println("Removed element: " + priorityQueue.remove()); // remove() retrieves and removes the front element, throws an exception if the queue is empty
            System.out.println("Priority Queue after remove: " + priorityQueue); 

            System.out.println("Is priority queue empty? " + priorityQueue.isEmpty());
            priorityQueue.clear();
            System.out.println("Priority Queue after clear: " + priorityQueue);

            // PriorityQueue is a data structure that follows the priority-based ordering principle.
            // It allows you to store and manipulate a collection of elements in a way that
            // the element with the highest priority is always at the front. Here are some key
            // features and characteristics of PriorityQueue:

            // 1. Priority Order: Elements are ordered based on their priority, not their insertion order.

            // 2. Enqueue and Dequeue Operations: You can add elements to the priority queue using
            // the enqueue operation and remove elements using the dequeue operation.

            // 3. Dynamic Size: The size of the priority queue can grow or shrink dynamically as
            // elements are added or removed.

            // 4. Use Cases: Priority queues are commonly used in scenarios such as task scheduling,
            // Dijkstra's algorithm, and Huffman coding.

        }

}
