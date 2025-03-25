package org.secondHighestSalary;

public class Employee {
    int salary;
    String name;


    public Employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name + " - " + salary;
    }
}
