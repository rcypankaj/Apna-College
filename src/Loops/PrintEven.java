package Loops;

import java.util.Scanner;

//Enter a number and printing all even element till number
// start

public class PrintEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= n; i += 2) {
            System.out.print(i+ " ");
        }
    }
}

// end
