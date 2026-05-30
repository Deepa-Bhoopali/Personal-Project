package com.myfirstspring.learn_spring_framework.learnCollectionframework;

import java.util.*;

class Task {
    int priority;
    int deadline;
    String name;

    Task(int p, int d, String n) {
        priority = p;
        deadline = d;
        name = n;
    }
}

public class PriorityQueueCustomLogic {
    public static void main(String[] args) {

        PriorityQueue<Task> pq = new PriorityQueue<>((a, b) -> {
            if (a.priority != b.priority) {
                return b.priority - a.priority; // higher priority first
            } else {
                return a.deadline - b.deadline; // earlier deadline first
            }
        });

        // 👉 This tells Java:

        // If a should come before b → return negative
        // If b should come before a → return positive

        // So effectively:
        // Higher priority comes first
        // If equal → smaller deadline comes first

        pq.add(new Task(2, 5, "Task A"));
        pq.add(new Task(3, 10, "Task B"));
        pq.add(new Task(3, 2, "Task C"));

        while (!pq.isEmpty()) {
            Task t = pq.poll();
            System.out.println(t.name);
        }
    }
}