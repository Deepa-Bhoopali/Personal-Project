package com.myfirstspring.learn_spring_framework.coding;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.*;

public class FindHighestNumberOfDuplicates {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list = List.of(1, 2, 3, 3, 3, 1, 3, 4, 5, 6, 7, 7, 7, 7, 7);
        HashMap<Integer, Integer> dup = new HashMap<>();

        for (int x : list) {
            dup.put(x, dup.getOrDefault(x, 0) + 1);
        }

        int max = 0;
        int res = 0;
        for (Map.Entry<Integer, Integer> e : dup.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
                res = e.getKey();
            }
        }

        System.out.println(res);

    }
}
