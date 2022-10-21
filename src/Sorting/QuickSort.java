package Sorting;

import java.util.Scanner;
// Quick Sort
/* Time Complexity
    Worst case -> O(n^2)
    Average case -> O(nlogn)
    best case -> O(nlogn)
 */
// Start
public class QuickSort {
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = pivot;
        arr[high] = temp;
        return i;
    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pidx = partition(arr, low, high);
            quickSort(arr, low, pidx - 1);
            quickSort(arr, pidx+1, high);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // loop for input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Quick Sort function call
        quickSort(arr, 0 , n-1);

        // Print
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
//End
