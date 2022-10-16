package Recursion;

import java.util.Scanner;
// Print numbers from n to 1.
// Start
public class PrintNoNTo1 {
    static void printNumbers(int n) {
        if (n == 0) return;
        System.out.print(n+" ");
        printNumbers(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printNumbers(n);
    }
}
// End
