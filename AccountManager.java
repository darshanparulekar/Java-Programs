import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class AccountManager {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loggedIn = false;
        String loggedInUser = "";

        while (!loggedIn) {
            System.out.print("Enter '1' to create a new account or '2' to log in: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Enter a new username: ");
                String username = input.nextLine();
                System.out.print("Enter a new password: ");
                String password = input.nextLine();

                try {
                    File file = new File("accounts.csv");
                    if (!file.exists()) {
                        file.createNewFile();
                    }

                    FileWriter writer = new FileWriter(file, true);
                    writer.write(username + "," + password + "\n");
                    writer.close();
                    System.out.println("Account created successfully.");
                } catch (IOException e) {
                    System.out.println("Error creating account: " + e.getMessage());
                }

            } else if (choice == 2) {
                System.out.print("Enter your username: ");
                String username = input.nextLine();
                System.out.print("Enter your password: ");
                String password = input.nextLine();

                try {
                    String content = new String(Files.readAllBytes(Paths.get("accounts.csv")));
                    String[] lines = content.split("\n");
                    boolean found = false;
                    for (String line : lines) {
                        String[] values = line.split(",");
                        if (values.length == 2 && values[0].equals(username) && values[1].equals(password)) {
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        System.out.println("Login successful!");
                        loggedIn = true;
                        loggedInUser = username;
                    } else {
                        System.out.println("Invalid username or password.");
                    }
                } catch (IOException e) {
                    System.out.println("Error reading account data: " + e.getMessage());
                }
            }
        }

        System.out.println("Welcome, " + loggedInUser + "!");
    }
}
