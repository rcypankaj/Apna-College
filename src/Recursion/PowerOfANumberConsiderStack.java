package Recursion;

import java.util.Scanner;
// Print x^n (with stack height = logn)
// Start
public class PowerOfANumberConsiderStack {
    static int calculatePower(int x, int n) {
        // base case
        if (n == 0) return 1;
        // check even or odd before recursive call
        if (n%2 == 0) {
            return calculatePower(x, n/2) * calculatePower(x, n/2);
        }
        else
            return x * calculatePower(x, n / 2) * calculatePower(x, n/ 2);
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
