package com.myfirstspring.learn_spring_framework.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LearnStream1 {
        public static void main(String[] args) {

                // https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062

                // Given a list of integers, find out all the even numbers that exist in the
                // list using Stream functions?
                List<Integer> n = List.of(1, 2, 3, 4, 5, 6, 7, 8);
                n.stream().filter(n1 -> n1 % 2 == 0).forEach(e -> System.out.println(e));

                int[] newwArr= n.stream().filter(n1->n1%2==0).mapToInt(Integer::intValue).toArray();

                int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
                Arrays.stream(arr).filter(n1 -> n1 % 2 == 0).forEach(e -> System.out.println(e));

                // .boxed() converts primitive int values into Integer objects.

                // 1. Takes an array
                // 2. Converts it into a stream
                // 3. Converts primitive ints to Integer objects
                // 4. Splits numbers into:
                // 5. Even numbers (key = true)
                // 6. Odd numbers (key = false)
                // 7. Stores them in a Map
                Map<Boolean, List<Integer>> list = Arrays.stream(arr).boxed()
                                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

                System.out.println(list);

                // Given a list of integers, find out all the numbers starting with 1 using
                // Stream functions?

                List<Integer> l = List.of(11, 12, 111, 23, 45, 67, 1, 233, 1122, 78);
                l.stream().map(s -> s + "").filter(e -> e.startsWith("1")).forEach(System.out::println);


                // How to find duplicate elements in a given integers list in java using Stream
                // functions?
                List<Integer> list2 = List.of(1, 1, 2, 2, 3, 4, 5, 5, 6);
                Set<Integer> duplicates = list2.stream()
                                .collect(Collectors.groupingBy(li -> li, Collectors.counting()))
                                .entrySet().stream()
                                .filter(val -> val.getValue() > 1)
                                .map(m -> m.getKey())
                                .collect(Collectors.toSet());

                System.out.println(duplicates);

                // 6. Given the list of integers, find the first element of the list using
                // Stream
                // functions?

                List<Integer> list3 = List.of(10, 20, 30, 40);

                list3.stream().findFirst().ifPresent(System.out::println);
                int first = list3.stream().findFirst().orElse(0);
                System.out.println(first);

                // Given a list of integers, find the total number of elements present in the
                // list using Stream functions?

                List<Integer> list4 = List.of(10, 20, 30, 40);

                Long count = list4.stream().count();
                System.out.println(count);
                /* When numbers are given as Array int[] arr = {10,15,8,49,25,98,98,32,15}; */
                int[] arr1 = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
                System.out.println(Arrays.stream(arr1).boxed().count());

                // 7. Given a list of integers, find the maximum value element present in it
                // using
                // Stream functions?

                List<Integer> list5 = Arrays.asList(10, 15, 8, 49, 25, 99, 98, 32, 15);

                System.out.println(list5.stream()
                                .max(Integer::compare)
                                .get());
                                //or
                list5.stream().sorted(Collections.reverseOrder()).findFirst().ifPresent(System.out::println);

                // Given a String, find the first non-repeated character in it using Stream
                // functions?

                String input = "Java articles are Awesome";

                Character result = input.toLowerCase()
                                .chars()
                                .mapToObj(c -> (char) c)
                                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                                // internally it will create hashmap and the order is not preserved so we
                                // explicitly mentioned LinkedHashMap to preserve the order of characters
                                .entrySet().stream()
                                .filter(e -> e.getValue() == 1)
                                .map(e -> e.getKey())
                                .findFirst()
                                .orElse(null);

                System.out.println(result);

                // 8. Given a String, find the first repeated character in it using Stream
                // functions?

                String input1 = "Java articles are Awesome";

                Character result1 = input1.toLowerCase()
                                .chars() // creates stream of int values representing the Unicode code points of
                                         // characters in the string
                                .mapToObj(c -> (char) c) // converts the int values back to Character objects, creating
                                                         // a
                                                         // Stream<Character>
                                .collect(Collectors.groupingBy(c -> c, LinkedHashMap::new, Collectors.counting()))
                                // groups the characters in the stream by their identity (c -> c) and counts the
                                // occurrences of each character, storing the results in a LinkedHashMap to
                                // preserve the order of characters
                                .entrySet().stream()
                                .filter(m -> m.getValue() > 1)
                                .map(q -> q.getKey())
                                .findFirst()
                                .orElse(null);
                System.out.println(result1);

                // 9. Given a list of integers, sort all the values present in it using Stream
                // functions?

                List<Integer> list6 = List.of(100, 20, 30, 40);
                list6 = list6.stream().sorted().toList();
                System.out.println(list6);
                int[] arr6 = { 10, 15, 8, 49, 25, 98, 98, 32, 15 };
                list6 = Arrays.stream(arr6).boxed().sorted().collect(Collectors.toList());
                System.out.println(list6);

                // 10. Given a list of integers, sort all the values present in it in descending
                // order using Stream functions?

                list6 = list6.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
                System.out.println(list6);

                // 11. Given an integer array nums, return true if any value appears at least
                // twice in the array, and return false if every element is distinct.
                int[] arr8 = { 10, 15, 8, 49, 25, 98, 32 };

                List<Integer> arr7 = Arrays.stream(arr8).boxed().distinct().collect(Collectors.toList());
                if (arr8.length == arr7.size()) {
                        System.out.println("false");
                } else {
                        System.out.println("true");
                }

                // 12 . 13. Write a Java 8 program to concatenate two Streams?
                List<Integer> list7 = List.of(1, 2, 3);
                List<Integer> list8 = List.of(4, 5, 6);
                List<Integer> concatenated = Stream.concat(list7.stream(), list8.stream()).collect(Collectors.toList());
                System.out.println(concatenated);

                List<String> s7 = Arrays.asList("Hello", "World", "Java");
                List<String> s8 = Arrays.asList("Streams", "are", "powerful");
                Stream<String> concatenatedStream = Stream.concat(s7.stream(), s8.stream());
                List<String> concatenatedList = concatenatedStream.collect(Collectors.toList());
                System.out.println(concatenatedList);

                // 14. Java 8 program to perform cube on list elements and filter numbers
                // greater than 50.

                List<Integer> list10 = Arrays.asList(1, 2, 3, 4, 5, 6);

                list10.stream().map(m -> m * m * m).filter(m -> m > 50).forEach(System.out::println);
        }

}
