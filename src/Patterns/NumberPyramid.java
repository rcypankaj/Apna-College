package Patterns;

import java.util.Scanner;
// Print Numbers Pyramid
// Start
public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            // Inner loop for print numbers
            for (int j = 1; j <= i; j++)
                System.out.print(i+"   ");

            System.out.println();
        }
    }
}

// End
