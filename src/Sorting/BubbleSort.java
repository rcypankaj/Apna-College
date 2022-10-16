package Sorting;

import java.util.Scanner;
// Bubble sorting
// Time complexity -> O(n^2)
// Start
public class BubbleSort {
    static void bubbleSort (int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j + 1] = temp;
                }
            }
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

        bubbleSort(a);
    }
}

// End
