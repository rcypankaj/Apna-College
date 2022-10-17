package Recursion;

import java.util.HashSet;
import java.util.Scanner;
// Print all unique subsequences of a string
// Time Complexity -> O(2^n)
// Start
public class UniqueSubsequences {
    static void printUniqueSubseq(String str1, int idx, String res, HashSet<String> allSubseq) {
        // base case
        if (idx == str1.length()) {
            if (allSubseq.contains(res)) return;
            else {
                System.out.println(res);
                allSubseq.add(res);
                return;
            }
        }
        // either choose
        printUniqueSubseq(str1, idx + 1, res + str1.charAt(idx), allSubseq);

        // either not choose
        printUniqueSubseq(str1, idx+1, res, allSubseq);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = sc.next();
        HashSet<String> allSubseq = new HashSet<>();

        printUniqueSubseq(str1, 0, "", allSubseq);
    }
}

// End
