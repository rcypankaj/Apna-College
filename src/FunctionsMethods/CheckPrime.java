package FunctionsMethods;

import java.util.Scanner;
// Check a given number prime or not
// Start
public class CheckPrime {
    public static boolean isPrime(int n, int idx) {
        if (idx == n) return true;
        if (n % idx == 0) return false;
        return isPrime(n, idx + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        if(isPrime(n, 2))
            System.out.println("This is a prime number");
        else System.out.println("This is not a prime number");

    }
}

// End
