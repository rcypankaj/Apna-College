package Patterns;

import java.util.Scanner;
// Print Half Pyramid With Numbers
// Start
public class HalfPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // inner loop for column
            for (int j = 1; j <= i; j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}

// End
