package org.HashLinkedSetUserNumber;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class HashLinkedSetUserNumber {
    public static void main(String[] args) {
        // Creating a LinkedHashSet for storing numbers
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter numbers to add to the LinkedHashSet (type '-1' to stop):");

        while (true) {
            System.out.print("Enter number: ");

            // Check if input is an integer
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input! Please enter a valid number.");
                scanner.next(); // Consume invalid input
                continue;
            }

            int input = scanner.nextInt();

            if (input == -1) {
                break; // Stop taking inputs when user enters -1
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
