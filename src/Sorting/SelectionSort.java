package Sorting;

import java.util.Scanner;
// Selection sorting
// Time complexity -> O(n^2)
// Start
public class SelectionSort {
    static void selectionSort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i; j < a.length; j++) {
                if (a[smallest] > a[j]) {
                    smallest = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;
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

        selectionSort(a);
    }
}

// End
