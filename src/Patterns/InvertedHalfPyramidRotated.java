package Patterns;

import java.util.Scanner;
// Print Inverted Half Pyramid Rotated 180 deg
// start

public class InvertedHalfPyramidRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Outer loop
        for (int i = 1; i <= n; i++) {
            // Inner loop
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            // Inner loop
            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            // for nrxt line
            System.out.println();
        }

    }
}

// end
