package com.myfirstspring.learn_spring_framework.streams;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LearnStream {
    public static void main(String[] args) {
        // https://www.youtube.com/watch?v=yv9Q2E39kJM

        var persons = new ArrayList<person>();
        persons.add(new person("John", 25));
        persons.add(new person("Zane", 30));
        persons.add(new person("Jack", 5));
        persons.add(new person("Jill", 15));
        persons.add(new person("Dee", 18));

        // use stream to filter the persons whose age is less than or equal to 18
        List<person> res = persons.stream()
                .filter(p -> p.age <= 18).toList();
        // res.stream().forEach(p->System.out.println(p.name));

        // use map
        res.stream().map(
                p -> p.name).forEach(System.out::println); // here res.stream is person stream and map is stream of
                                                           // string

        // sort by name
        persons.stream().sorted((p1, p2) -> p1.name.compareTo(p2.name))
                .map(p -> p.name)
                .forEach(System.out::println);

        ArrayList<businesses> businessList = new ArrayList<>();
        businessList.add(
                new businesses("Business 1", new ArrayList<>(List.of(new person("John", 25), new person("Jane", 30)))));
        businessList.add(
                new businesses("Business 2", new ArrayList<>(List.of(new person("Jack", 35), new person("Jill", 40)))));

        String s = businessList.stream()
                .flatMap(b -> b.employee.stream())
                .map(e -> e.name)
                .collect(Collectors.joining(", "));
        System.out.println(s);
    }

}

class person {

    String name;
    int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class businesses {
    String name;
    ArrayList<person> employee;

    public businesses(String name, ArrayList<person> employee) {
        this.name = name;
        this.employee = employee;
    }
}
