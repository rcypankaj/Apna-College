package Patterns;

import java.util.Scanner;
// Print Pascal's Triangle
// Start

public class PascalsTriangle {
    public static int coeff(int n, int r) {
        int c = fact(n)/(fact(r) * fact(n -r));
        return c;
    }
    public static int fact(int n) {
        if (n == 1 || n == 0) return 1;
        return n * fact (n - 1);
    }


    public static void main(String[] args) {
        PascalsTriangle obj = new PascalsTriangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines");
        int n = sc.nextInt();

        // loop for rows
        for (int i = 0; i < n; i++) {
            // loop for spaces
            for (int j = 0; j < n-i - 1; j++) {
                System.out.print(" ");
            }

            // loop for print element
            for (int j = 0; j <= i; j++) {
                System.out.print(obj.coeff(i,j)+ " ");
            }
            System.out.println();
        }
    }
}

// End
