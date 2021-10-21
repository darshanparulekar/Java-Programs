import java.util.*;
import java.io.*;

public class Multiplication_Table {
    public static void main(String args[]) {
        System.out.println("Enter Value :- ");
        
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i;
        int result = 1;
        System.out.println();

        for (i = 1; i <= 10; i++) {
            result = N * i;

            System.out.print(+N);
            System.out.print(" x ");
            System.out.print(+i);
            System.out.print(" = ");
            System.out.print(+result);
            System.out.print("\n");

        }
    }
}
