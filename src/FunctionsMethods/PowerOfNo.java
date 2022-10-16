package FunctionsMethods;

import java.util.Scanner;
/*Two numbers are entered by the user, x and n.
    Write a function to find the value of one number raised to the power of another i.e. x^n.*/
// Start

public class PowerOfNo {
    static int calculatePower(int x, int n, int res) {
        if (n == 0) return res;
        res *= x;
        return calculatePower(x, n-1, res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(calculatePower(x,n,1));

    }
}

// End
