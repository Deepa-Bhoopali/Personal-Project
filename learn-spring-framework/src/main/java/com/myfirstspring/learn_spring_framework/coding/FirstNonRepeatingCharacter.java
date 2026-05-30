package com.myfirstspring.learn_spring_framework.coding;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        String input = "aagbbcddeef";  
        char prev = input.charAt(0);
        for (int i = 1; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i == input.length() - 1) {
                if (c != prev) {
                    System.out.println(c);
                }
                break;
            } else if (c != prev && c != input.charAt(i + 1)) {
                System.out.println(c);
                break;
            }
            prev = c;
        }

        input.toLowerCase().chars().boxed()
                .collect(Collectors.groupingBy(x -> (char) x.intValue(), Collectors.counting()))
                .entrySet().stream().filter(q -> q.getValue() == 1).findFirst()
                .ifPresent(z -> System.out.println(z.getKey()));

        input.toLowerCase().chars()
        .mapToObj(c->(char)c)
        .collect(Collectors.groupingBy(c->c, LinkedHashMap::new,Collectors.counting()))
        .entrySet()
        .stream()
        .filter(e->e.getValue() == 1)
        .findFirst().ifPresent(z -> System.out.println(z.getKey()));

        // reverse a string
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();
        System.out.println("Reversed string: " + reversed);
    }

}
