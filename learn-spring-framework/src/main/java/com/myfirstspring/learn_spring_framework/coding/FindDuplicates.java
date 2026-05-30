package com.myfirstspring.learn_spring_framework.coding;

import java.util.Arrays;
import java.util.HashSet;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 9, 10 };

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (!set.add(arr[i])) {
                duplicates.add(arr[i]);
            }
        }
        System.out.println("Duplicate elements: " + duplicates);

        // streams

        Arrays.stream(arr).boxed().collect(Collectors.groupingBy(x -> x, Collectors.counting())).entrySet().stream()
                .filter(x -> x.getValue() > 1).forEach(y -> System.out.println(y.getKey()));
    }
}
