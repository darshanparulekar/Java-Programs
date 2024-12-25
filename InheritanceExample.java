// Parent Class

import java.util.Scanner;

class Animal {
    String name;

    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}

// Child Class
class Dog extends Animal {
    void bark() {
        System.out.println(name + " is barking.");
    }
}

// Main Class
public class InheritanceExample {
    public static void main(String[] args) {
        // Create an object of the child class
        Dog dog = new Dog();
        Scanner sc = new Scanner(System.in);
        
        // Access properties and methods of parent class
        System.out.println("Enter name of dog");
        String qwerty = sc.nextLine();
        dog.name = qwerty;
        dog.eat();       // Inherited method
        dog.sleep();     // Inherited method

        // Access method of the child class
        dog.bark();
    }
}