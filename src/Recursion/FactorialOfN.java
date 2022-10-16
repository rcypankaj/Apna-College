package Recursion;

import java.util.Scanner;
// Print factorial of a number n.
// Start
public class FactorialOfN {
    static int fact(int n) {
        // base case
        if (n == 0) return 0;
        if (n == 1) return 1;

        return n * fact(n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}

// End