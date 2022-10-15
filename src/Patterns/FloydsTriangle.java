package Patterns;

import java.util.Scanner;
// Print Floyd's Triangle
// Start
public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = 1;

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // inner loop for column
            for (int j = 1; j <= i; j++)
                System.out.print(k++ +" ");
            System.out.println();
        }
    }
}

// End
