package FunctionsMethods;

import java.util.Scanner;
// function to multiply 2 numbers.
// Start
public class MultiplytwoNumber {
    public static void printMultiply(int a, int b) {
        System.out.println(a * b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        printMultiply(a,b);
    }
}

// End
