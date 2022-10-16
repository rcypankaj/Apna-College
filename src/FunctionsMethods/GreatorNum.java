package FunctionsMethods;

import java.util.Scanner;

// a function which takes in 2 numbers and returns the greater of those two.
// Start
public class GreatorNum {
    static int findGreator(int a, int b) {
        if (a >= b) return a;
        return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findGreator(a,b));
    }
}

// End
