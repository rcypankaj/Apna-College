package Patterns;

import java.util.Scanner;
// Print Palindrome number pyramid
// Start
public class PalindromeNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");

            // inner loop for element till 1
            for (int j = i; j >= 1; j--)
                System.out.print(j+" ");

            // Inner loop for remaining element
            for (int j = 2; j <= i; j++)
                System.out.print(j+" ");

            System.out.println();
        }
    }
}

// End
