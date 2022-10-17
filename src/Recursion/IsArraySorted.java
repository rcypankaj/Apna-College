package Recursion;

import java.util.Scanner;
// Check if an array is sorted (strictly increasing). - O(n)
// Start
public class IsArraySorted {
    static boolean isSorted(int[] a, int idx) {
        //base case
        if (idx == a.length - 1) return true;
        if (a[idx] >= a[idx+1])
            return false;
        return isSorted(a, idx + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        // loop for input
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        if(isSorted(a, 0))
            System.out.println("Strictly Increasing");
        else System.out.println("Not Strictly Increasing");
    }
}
// End
