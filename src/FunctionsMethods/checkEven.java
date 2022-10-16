package FunctionsMethods;

import java.util.Scanner;
// Check given number is even or not
// Start
public class checkEven {
    static boolean isEven(int n) {
        if (n %2 == 0) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        if(isEven(n))
            System.out.println("This is an even number");
        else System.out.println("This is not an even number");
    }
}

// End
