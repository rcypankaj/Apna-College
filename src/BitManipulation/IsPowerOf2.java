package BitManipulation;

import java.util.Scanner;
// A program to find if a number is a power of 2 or not.
// Start
public class IsPowerOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int count = 0;

        while (n != 0) {
            int res = n & 1;
            if (res == 1) count++;
           n = n>>1;
        }
        if (count == 1) System.out.println("This number is power of two");
        else System.out.println("This number is not power of two");
    }
}

// End
