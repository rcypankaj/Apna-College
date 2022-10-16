package FunctionsMethods;

import java.util.Scanner;
// A program to print Fibonacci series of n terms where n is input by user :
// Start

public class FibonacciSeries {
    static void printFibonacci(int n, int a, int b, int idx) {
        if (1 == n) return;
        if(n == idx) System.out.print(a+" "+ b+" ");
        else System.out.print(b+" ");
        printFibonacci(n-1, b,a+b, idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1;
        printFibonacci(n, a, b, n);
    }
}

// End
