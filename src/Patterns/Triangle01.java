package Patterns;

import java.util.Scanner;
// print 0 1 Triangle
// Start
public class Triangle01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // outer loop for row
        for (int i = 1; i <= n; i++) {
            //Inner loop for column
            for (int j = 1; j <= i; j++) {
                if ((i + j)%2 == 0)
                    System.out.print(1+" ");
                else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}

// End
