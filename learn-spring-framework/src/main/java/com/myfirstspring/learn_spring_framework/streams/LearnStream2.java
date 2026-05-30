package com.myfirstspring.learn_spring_framework.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LearnStream2 {
        public static void main(String[] args) {
                // https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062

                // 15 . Write a Java 8 program to sort an array and then convert the sorted
                // array into Stream?

                int[] arr = { 22, 33, 11, 2, 7, 88, 9 };
                Arrays.sort(arr);
                Arrays.stream(arr).forEach(System.out::println);

                // 16. How to use map to convert object into Uppercase in Java 8?

                List<String> names = Arrays.asList("Dee", "Raj", "John");
                names.stream().map(m -> m.toUpperCase()).forEach(System.out::println);


                List<String> names2 = Collections.emptyList();
                Optional.ofNullable(names2)
                                .orElseGet(Collections::emptyList) // creates empty immutable list: [] in case names2
                                                                   // is null
                                .stream().filter(Objects::nonNull) // loop throgh each object and consider non null
                                                                   // objects
                                .forEach(System.out::println); // it will print tag names

                // Write a program to print the count of each character in a String?

                String string1 = "Hello hi how are you";
                string1.replace(" ", "").chars().map(Character::toLowerCase).mapToObj(c -> (char) c)
                                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                                .forEach((k, v) -> System.out.println(k + " : " + v));

                // Que1 . I have a List= {2s, 123, gr3,56}
                // retur valid list of integer are List= {123 , 56}

                List<String> lists = Arrays.asList("2s", "123", "gr3", "56");

                List<Integer> res = lists.stream().filter(s -> s.matches("\\d+")).map(Integer::parseInt)
                                .collect(Collectors.toList());
                System.out.println(res);

                // Given a array of integers , print the second highest element

                int[] arr1 = { 2, 5, 6, 22, 12, 14, 18 };
                Arrays.stream(arr1).boxed().sorted(Collections.reverseOrder()).skip(1).findFirst()
                                .ifPresent(System.out::println);

                int first = 0, second = 0;

                for (int i = 0; i < arr1.length; i++) {
                        if (arr1[i] > first) {
                                second = first;
                                first = arr1[i];
                        } else if (arr1[i] > second) {
                                second = arr1[i];
                        }
                }

                System.out.println(second);
        }
}
