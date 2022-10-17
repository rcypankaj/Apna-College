package Recursion;

import java.util.Scanner;
// Print all the subsequences of a string.
// Time Complexity -> O(2^n)
// Start
public class Subsequences {
    static void printSubsequences(String str1, int idx, String res) {
        // base case
        if (idx == str1.length()) {
            System.out.println(res);
            return;
        }
        // either choose
        printSubsequences(str1, idx+1, res+ str1.charAt(idx));

        // either not choose
        printSubsequences(str1, idx + 1, res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = sc.next();
        printSubsequences(str1, 0, "");
    }
}
// End
