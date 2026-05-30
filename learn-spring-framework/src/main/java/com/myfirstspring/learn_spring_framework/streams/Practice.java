package com.myfirstspring.learn_spring_framework.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {
       
         String input = "Jajva articles are Awesome";

         Character mine=input.toLowerCase().chars().mapToObj(c-> (char) c)
         .collect(Collectors.groupingBy(l->l,LinkedHashMap::new,Collectors.counting()))
         .entrySet().stream()
         .filter(x->x.getValue()==1)
         .map(y->y.getKey())
         .findFirst().get();
            System.out.println(mine);
         
    }

}
