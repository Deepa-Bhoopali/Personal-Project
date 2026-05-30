package com.myfirstspring.learn_spring_framework.learnCollectionframework;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LearnArrayList {

    public static void main(String[] args) {

        // Create an ArrayList
     //   List<String> fruits = new ArrayList<>();
        List<String> fruits = new LinkedList<>();   // Using LinkedList instead of ArrayList to demonstrate polymorphism
       

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Access elements from the ArrayList
        System.out.println("First fruit: " + fruits.get(0));
        System.out.println("Second fruit: " + fruits.get(1));
        System.out.println("Third fruit: " + fruits.get(2));

        // Remove an element from the ArrayList
        fruits.remove("Banana");

        // Iterate over the ArrayList
        System.out.println("Fruits in the list:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        ArrayList<String> vegetables = new ArrayList<>();
        vegetables.add("Carrot");
        vegetables.add("Broccoli");
        vegetables.add("Spinach");  

        fruits.addAll(vegetables); // Merging two ArrayLists    
        System.out.println("Fruits and Vegetables in the list:" + fruits);

        fruits.remove(2); // Removing element at index 2
        System.out.println("Fruits and Vegetables after removing element at index 2:" + fruits);


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        numbers.remove(Integer.valueOf(30)); // Removing element with value 30


        fruits.add(2,"Carrot"); // Adding element at index 2
        System.out.println("Fruits and Vegetables after adding Carrot at index 2:" + fruits);

        fruits.set(2, "Cucumber"); // Replacing element at index 2 with Cucumber
        System.out.println("Fruits and Vegetables after replacing element at index 2 with Cucumber:" + fruits);

        fruits.clear(); // Clearing all elements from the ArrayList
        System.out.println("Fruits and Vegetables after clearing the list:" + fruits);

        // ArrayList is a resizable array implementation of the List interface in Java.
        // It allows you to store and manipulate a dynamic collection of elements. Here
        // are some key features and characteristics of ArrayList:

        // 1. Dynamic Sizing: ArrayList can grow or shrink in size as needed. When you
        // add elements to an ArrayList, it automatically resizes itself to accommodate
        // the new elements.

        // 2. Ordered Collection: ArrayList maintains the order of elements as they were
        // added. You can access elements using their index.

        // 3. Allows Duplicates: ArrayList allows duplicate elements, meaning you can
        // have multiple occurrences of the same value.

        // 4. Null Values: ArrayList can contain null values, which means you can have
        // null entries in your list.

        // 5. Not Synchronized: ArrayList is not synchronized, which means it is not
        // thread-safe. If multiple threads access an ArrayList concurrently, you need
        // to synchronize it externally.

        // 6. Performance: ArrayList provides constant-time performance for basic operations
        // like adding and accessing elements, but it may require resizing when adding
        // elements, which can lead to occasional performance overhead.

    }

}
