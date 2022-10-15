package Patterns;

import java.util.Scanner;
// Print Solid Rhombus
// Start
public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Outer loop for row
        for (int i = 1; i <= n; i++) {
            // Inner loop for spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            //Inner loop for *
            for (int j = 1; j <= n; j++)
                System.out.print("* ");

            System.out.println();

        }
    }
}

// End
