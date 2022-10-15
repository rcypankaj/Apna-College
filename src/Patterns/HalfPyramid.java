package Patterns;

import java.util.Scanner;
// print Half Pyramid
//start
public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        //Outer loop
        for (int i = 1; i <= row; i++) {
            //Inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

// End
