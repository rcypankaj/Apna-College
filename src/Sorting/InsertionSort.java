package Sorting;

import java.util.Scanner;
// Insertion sorting
// Time complexity -> O(n^2)
// Start
public class InsertionSort {
    static void insertionSort(int[] a) {
        // loop for unsorted part
        for (int i = 1; i < a.length; i++) {
            int current = a[i];
            int  j = i - 1;

            // loop for sorted part
            while (j >= 0 && current < a[j]) {
                // Keep swapping
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = current;
        }

        // loop for output
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of the array");
            int n = sc.nextInt();
            int[] a = new int[n];

            // loop for input
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            insertionSort(a);
    }
}

// End
