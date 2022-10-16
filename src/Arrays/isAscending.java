package Arrays;

import java.util.Scanner;
// Take an array of numbers as input and check if it is an array sorted in ascending order.
// Start
public class isAscending {
    static boolean checkAscending(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];

        // loop for input
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // for comparing
        if (checkAscending(a)) System.out.println("This array is sort in Ascending Order");
        else System.out.println("This array is not sort in ascending order");


    }
}

// End
