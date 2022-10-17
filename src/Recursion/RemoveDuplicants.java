package Recursion;

import java.util.Scanner;
// Remove duplicates in a string
// Time Complexity -> O(n)
// Start
public class RemoveDuplicants {
    static boolean[] map = new boolean[26];
    public static void removeChar(String str1, int idx, String res) {
        // base case
        if (str1.length() == idx) {
            System.out.println(res);
            return;
        }
        // Checking element available or not available in array
        if (map[str1.charAt(idx) - 'a'] == false){
            res += str1.charAt(idx);
        map[str1.charAt(idx) - 'a'] = true;
        }
        removeChar(str1, idx + 1, res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = sc.next();
        removeChar(str1, 0, "");
    }

}
// End
