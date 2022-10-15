package Conditional_Program;

// give two input numbers
// operations as follows
// Addition(a + b),  Subtraction(a - b),  Multiplication(a * b), Division(a/b), Modulo or Ramainder(a%b)

// start
import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Addition " + (a + b));
        System.out.println("Subtraction " + (a - b));
        System.out.println("Multiplication " + (a * b));
        System.out.println("Division " + (a / b));
        System.out.println("Modulo " + (a % b));
    }
}

// end