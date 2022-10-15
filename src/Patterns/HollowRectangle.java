package Patterns;

import java.util.Scanner;
// print Hollow Rectangle
//start
public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colm = sc.nextInt();

        //Outer loop
        for (int i = 1; i <= row; i++) {
            //Inner loop
            for (int j = 1; j <= colm; j++) {
                if (i == 1 || i == row || j == 1 || j == colm)
                    System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}

//End
