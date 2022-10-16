package Arrays;

import java.util.Scanner;
// Searching for an element x in a matrix.
public class FindElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int colm = sc.nextInt();
        int[][] a = new int[row][colm];

        // loop for input
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter a number which you want find");
        int x = sc.nextInt();

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colm; j++) {
                if (a[i][j] == x) {
                    System.out.println("This element is available in row no "+i+" and column no "+ j);
                    return;
                }
            }
        }
        System.out.println("This element is not available in this array");
    }
}
