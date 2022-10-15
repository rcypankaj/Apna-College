package Patterns;

import java.util.Scanner;
// Print Inverted Half Pyramid With Numbers
// Start
public class InvertedHalfPyramidWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        //Outer loop for rows
        for (int i = n; i >= 1; i--) {
            //inner loop for print element
            for (int j = 1; j <= i; j++)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}

// End
