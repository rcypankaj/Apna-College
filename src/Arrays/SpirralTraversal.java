package Arrays;

import java.util.Scanner;
// Print the spiral order matrix of numbers.
// Start
public class SpirralTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row and colum size of the matrix");
        int row = sc.nextInt();
        int colm = sc.nextInt();
        int[][] a = new int[row][colm];

        // loop for input
        for (int i =0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        int left  = 0, right = colm - 1;
        int top = 0, bottom = row - 1;

        // for direction
        int dir = 0;
        // loop for output
        while (left <= right && top <= bottom) {

            switch (dir) {
                case 0:
                    for (int i = left; i <= right; i++)
                        System.out.print(a[top][i]+" ");
                    top++;
                    break;
                case 1:
                    for (int i = top; i <= bottom; i++)
                        System.out.print(a[i][right]+ " ");
                    right--;
                    break;
                case 2:
                    for (int i = right; i >= left; i--)
                        System.out.print(a[bottom][i]+ " ");
                    bottom--;
                    break;
                case 3:
                    for (int i = bottom; i >= top; i--)
                        System.out.print(a[i][left]+" ");
                    left++;
                    break;
            }
            dir = (dir + 1)% 4;
        }
    }
}

// End
