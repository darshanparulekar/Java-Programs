package org.HashLinked;


import java.util.LinkedHashSet;
import java.util.Set;

public class HashLinkedSetSystemString {
    public static void main(String[] args) {
        // Creating a LinkedHashSet for integers
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        // Adding integer elements
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        linkedHashSet.add(40);
        linkedHashSet.add(20); // Duplicate, will not be added

        // Displaying elements (Insertion order is maintained)
        System.out.println("LinkedHashSet Elements: " + linkedHashSet);
    }
}
