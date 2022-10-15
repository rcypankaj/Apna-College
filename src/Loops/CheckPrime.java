package Loops;

import java.util.Scanner;
// Check a number is prime or not (Input n from the user).
// start
public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1 || n == 0) System.out.println("This is Not Prime");
        else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    System.out.println("This is not prime");
                    return;
                }
            }
            System.out.println("This is a prime number");
        }
    }
}

// end
