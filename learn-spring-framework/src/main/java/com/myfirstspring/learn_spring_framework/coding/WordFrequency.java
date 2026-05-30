package com.myfirstspring.learn_spring_framework.coding;

import java.util.HashMap;

public class WordFrequency {

    public static void main(String[] args) {
        String text = " Hello world Hello dee Dee ";
        // System.out.println("Input text: " + text);
        // System.out.println("after trim: " + text.trim());

        String[] words = text.split(" ");

        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for(String w : words){
            //w= w.toLowerCase();
            frequencyMap.put(w,frequencyMap.getOrDefault(w,0)+1);
        }

        for(HashMap.Entry<String,Integer>entry : frequencyMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
