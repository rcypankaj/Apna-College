package Backtracking;

import java.util.Scanner;
// Print all Permutations
// Time Complexity -> O(n*n!)
// Start
public class Permutation {
    static void printPermutations(String str, int idx, String perm) {
        // base case
        if (str.length() == 0) {
            System.out.println(perm);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            printPermutations(newStr, idx + 1, perm + currChar);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        printPermutations( str, 0, "");
    }
}

// End
