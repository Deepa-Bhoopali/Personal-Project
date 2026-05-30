package com.myfirstspring.learn_spring_framework.coding;

import java.util.HashSet;

public class FindPairWithGivenSum {

    public static void main(String[] args) {
        int[] arr = { 1, 5, 7, -1, 5 };
        int sum = 6;

       HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
           int targ = sum -arr[i];
           if(set.contains(targ)){
            System.out.println("Pair found: (" + arr[i] + ", " + targ + ")");

           }
           set.add(arr[i]);
        }
    }
}
