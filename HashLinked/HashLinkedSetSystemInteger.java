package org.HashLinked;

import java.util.LinkedHashSet;
import java.util.Set;

public class HashLinkedSetSystemInteger {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("Apple");
        linkedHashSet.add("Banana");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Grapes");
        linkedHashSet.add("Banana"); // Duplicate, will not be added

        // Displaying elements (Insertion order is maintained)
        System.out.println("LinkedHashSet Elements: " + linkedHashSet);

    }
}
