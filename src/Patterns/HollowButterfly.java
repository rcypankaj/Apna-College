package Patterns;

import java.util.Scanner;
// Print Hollow Butterfly

// Start
public class HollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // loop for first half
        for (int i = 1; i <= n; i++) {
            // loop for print star
            for(int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else System.out.print("  ");
            }

            // loop for print space
            for (int j = 1; j <= (2 * n) - 2*i; j++)
                System.out.print("  ");

            // loop for print star
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else System.out.print("  ");
            }

            System.out.println();
        }

        // loop for Second half
        for (int i = n; i >= 1; i--) {
            // loop for print star
            for(int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else System.out.print("  ");
            }

            // loop for print space
            for (int j = 1; j <= (2 * n) - 2*i; j++)
                System.out.print("  ");

            // loop for print star
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("* ");
                else System.out.print("  ");
            }

            System.out.println();
        }
    }
}

// End
