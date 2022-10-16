package Recursion;

import java.util.Scanner;
// Print the fibonacci sequence till nth term.
// Start
public class FibonacciSeries {
    static void printFibonacci (int a, int b, int n, int idx) {
        // base case
        if (idx == 1) return;
        if (n == idx) System.out.print(a+" "+ b);
        else System.out.print(" "+ b);
        printFibonacci(b, a+b, n, idx-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of element");
        int n = sc.nextInt();
        int a = 0, b = 1;
        printFibonacci(a, b, n, n);
    }
}

// End
