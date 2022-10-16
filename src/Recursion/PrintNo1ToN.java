package Recursion;

import java.util.Scanner;
// Print numbers from 1 to N.
// Start
public class PrintNo1ToN {
    static void printNumbers(int a, int n) {
        if (n < a) return;
        System.out.print(a+" ");
        printNumbers(a+1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(1, n);
    }
}

// End
