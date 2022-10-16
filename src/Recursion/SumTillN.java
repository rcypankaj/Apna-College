package Recursion;

import java.util.Scanner;
// Print the sum of first n natural numbers.
// Start
public class SumTillN {
    static int printNumbers (int n) {
        if (n == 1) return 1;
        return n + printNumbers(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printNumbers(n));
    }
}

// End