package Recursion;

import java.util.Scanner;
// Print a string in reverse.
// Start
public class ReverseString {
    static void printReverseString(String str1, int idx) {
        // base case
        if (idx < 0) return;
        System.out.print(str1.charAt(idx));
        printReverseString(str1, idx - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = "";
        printReverseString(str1, str1.length() - 1);
    }
}

// End
