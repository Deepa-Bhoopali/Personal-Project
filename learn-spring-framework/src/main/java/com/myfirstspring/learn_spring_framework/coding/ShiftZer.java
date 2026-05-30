package com.myfirstspring.learn_spring_framework.coding;

public class ShiftZer {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 0, 0, 0, 6, 7, 8, 9, 0 };
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j]=arr[i];
                j++; 
            } 
        }
        for (int k = j; k < arr.length; k++) {
            arr[k] = 0;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
