package org.secondHighestSalary;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee("Darshan", 75000),
                new Employee("Ayush", 108000),
                new Employee("Apoorv", 91000),
                new Employee("Kunal", 67000),
                new Employee("Satyam", 105000),
                new Employee("Asif", 88000),
                new Employee("Adil", 95000),
                new Employee("Saket", 72000)
        );

                List<Employee> highestSalary= employees.stream()
                .sorted((a,b) -> b.getSalary() - a.getSalary())
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());

                System.out.println(highestSalary);
    }
}
