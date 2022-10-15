package Patterns;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for Column
            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            // Inner loop for Spaces
            for (int j = 1; j <= ((2 * n) - 2*i); j++)
                System.out.print("  ");

            // Inner loop for stars
            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }

        // loop for remaining part
        for (int i = n; i >= 1; i--) {
            // Inner loop for Column
            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            // Inner loop for Spaces
            for (int j = 1; j <= ((2 * n) - 2*i); j++)
                System.out.print("  ");

            // Inner loop for stars
            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}
