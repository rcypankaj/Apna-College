package BitManipulation;

import java.util.Scanner;
// A program to count the number of 1’s in a binary representation of the number.
// Start

public class Count1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        int count = 0;
        while (n > 0) {
            int res = n & 1;
            if (res == 1) count++;

            n = n>>1;
        }
        System.out.println(count);
    }
}

// End
