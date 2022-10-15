package Patterns;

import java.util.Scanner;
// Print Inverted Half Pyramid With Numbers Rotated by 180 deg
// Start

public class InvertedHalfPyramidWithNumbersRotated {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 0;

        // Outwer Loop
        for (int i = 1; i <= n; i++) {
            // Inner Loop for spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            // Inner loop for print numbers
            for (int j = n - k; j <= n; j++)
                System.out.print(j+" ");

            System.out.println();
            k++;
        }
    }
}

// End
