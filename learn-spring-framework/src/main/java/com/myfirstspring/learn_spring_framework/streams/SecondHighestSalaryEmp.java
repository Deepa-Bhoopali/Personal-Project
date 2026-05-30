package com.myfirstspring.learn_spring_framework.streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SecondHighestSalaryEmp {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", 5000),
                new Employee("Bob", 7000),
                new Employee("Charlie", 7000),
                new Employee("David", 6000));

        String name = employees.stream().map(e -> e.getSalary()).distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst()
                .flatMap(sa -> employees.stream().filter(x -> x.getSalary() == sa).map(e -> e.getName()).findFirst())
                .get();
        System.out.println(name);
    }

}

class Employee {
    private String name;
    private double salary;

    // Constructor, getters, setters
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}
