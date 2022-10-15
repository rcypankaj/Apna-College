package Patterns;

import java.util.Scanner;
// print Solid Rectangle
//start

public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colm = sc.nextInt();

        //Outer loop
        for (int i = 1; i <= row; i++) {
            //Inner loop
            for (int j = 1; j <= colm; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

//end
