package Patterns;

import java.util.Scanner;
// Print diamond pattern
//Start
public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            //Inner loop for spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            // Inner loop for print star
            for (int j = 1; j <= (2*i) - 1; j++)
                System.out.print("* ");

            System.out.println();
        }

        // Outer loop for rows
        for (int i = n; i >= 1; i--) {
            //Inner loop for spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            // Inner loop for print star
            for (int j = 1; j <= (2*i) - 1; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
}

// End
