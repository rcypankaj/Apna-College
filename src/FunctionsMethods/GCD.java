package FunctionsMethods;

import java.util.Scanner;
//  A function that calculates the Greatest Common Divisor of 2 numbers.

// Start
public class GCD {
    static int gcd(int a, int b) {
        return a % b == 0 ? b : gcd(b, a%b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(gcd(a,b));
    }
}

// End
