package Patterns;

import java.util.Scanner;
// Print Hollow Rhombus
// Start
public class HollowRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // loop for rows
        for (int i = 1; i <= n; i++) {
            // loop for spaes
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }

            // loop for print star
            for (int j = 1; j <= n; j++) {
                if (j == 1 || j == n || i == 1 || i == n)
                System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

// End
