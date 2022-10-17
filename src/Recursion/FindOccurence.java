package Recursion;

import java.util.Scanner;
// Find the occurrence of the first and last occurrence of an element using recursion.
// Start
public class FindOccurence {
    static int first = -1;
    static int last = -1;

    static void findOccurences(String str, int idx, char find) {

        // base case
        if (idx == str.length()) return;

        if (str.charAt(idx) == find) {
            if (first == -1) {
                first = idx;
            }
            else last = idx;
        }

        findOccurences(str, idx + 1, find);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char find = sc.next().charAt(0);
        findOccurences(str, 0, find);
        System.out.println(first);
        System.out.println(last);
    }
}

// End
