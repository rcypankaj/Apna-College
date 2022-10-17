package Recursion;

import java.util.Scanner;
// Print all the permutations of a string.
// Time Complexity -> O(n*n!)
// Start
public class Permutation {
    static void printPermutations(String str1, int idx, String res) {
        // base case
        if (0 == str1.length()) {
            System.out.println(res);
            return;
        }

        for (int i = 0; i < str1.length(); i++) {
            char currChar = str1.charAt(i);
            String newString = str1.substring(0,i)+str1.substring(i+1);
            printPermutations(newString, idx + 1, res + currChar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();

        printPermutations(str1, 0, "");
    }
}
// End
