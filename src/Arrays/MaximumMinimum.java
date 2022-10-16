package Arrays;

import java.util.Scanner;

// Find the maximum & minimum number in an array of integers.
// Start
public class MaximumMinimum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int n = sc.nextInt();
        int[] a = new int[n];

        // loop for input array element
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (min > a[i]) min = a[i];
            if (max < a[i]) max = a[i];
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}

// End
