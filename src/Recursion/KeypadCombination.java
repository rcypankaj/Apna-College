package Recursion;

import java.util.Scanner;
// Print keypad combination
// Time Complexity O(4^n)
// Start
public class KeypadCombination {
    static String[] keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    static void printKeypadCombination(String str1, int idx, String res) {
        // base case
        if (idx == str1.length()) {
            System.out.println(res);
            return;
        }
        char currChar = str1.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for (int i  = 0; i < mapping.length(); i++) {
            printKeypadCombination(str1, idx + 1, res+mapping.charAt(i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str1 = sc.next();
        printKeypadCombination(str1, 0, "");
    }
}
// End
