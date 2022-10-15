package Patterns;

import java.util.Scanner;

// Print Inverted Half Pyramid
//Start
public class InvertedHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        //Outer loop
        for (int i = row; i >= 1; i--) {
            //Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// End
