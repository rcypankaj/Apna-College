package Recursion;

import java.util.Scanner;
// Print x^n (with stack height = n)
// Start
public class PowerOfANo {
    static int calculatePower(int x, int n) {
        // base case
        if (1 == n) return x;
        return x * calculatePower(x, n - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and its power");
        int x = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(calculatePower(x,n));

    }
}

// End
