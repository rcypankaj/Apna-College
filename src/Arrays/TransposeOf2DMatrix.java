package Arrays;

import java.util.Scanner;
// A given matrix of N x M, print its transpose.
// Start
public class TransposeOf2DMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and colum size of the matrix");
        int row = sc.nextInt();
        int colm = sc.nextInt();
        int[][] a = new int[row][colm];

        // loop for input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        // loop for output
        for (int i = 0; i < colm; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(a[j][i]+" ");
            }
            System.out.println();
        }
    }
}

// End
