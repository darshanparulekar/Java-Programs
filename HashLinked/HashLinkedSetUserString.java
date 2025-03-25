package org.HashLinked;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class HashLinkedSetUserString {
    public static void main(String[] args) {
        // Creating a LinkedHashSet
        Set<String> linkedHashSet = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter elements to add to the LinkedHashSet (type 'exit' to stop):");

        while (true) {
            System.out.print("Enter element: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            boolean added = linkedHashSet.add(input);
            if (!added) {
                System.out.println("Duplicate entry! '" + input + "' is already in the set.");
            }
        }

        // Closing scanner
        scanner.close();

        // Displaying elements (Insertion order is maintained)
        System.out.println("\nLinkedHashSet Elements: " + linkedHashSet);
    }
}
