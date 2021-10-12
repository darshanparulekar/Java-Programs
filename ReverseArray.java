import java.io.*;
import java.util.*;

public class ReverseArray {
    public static void main(String args[]) {
        int a[] = new int[50];
        int i;
        Scanner sc = new Scanner(System.in);

        for (i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }

        System.out.print("\n");

        for (i = 4; i >= 0; i--) {
            System.out.print(a[i] + " \n");
        }
    }

}
