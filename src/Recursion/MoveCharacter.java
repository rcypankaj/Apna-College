package Recursion;

import java.util.Scanner;
// Move all ‘x’ to the end of the string. - O(n)
// Start
public class MoveCharacter {
    static String calculateString(int count, String res, char forFind) {
        // base case
        if (count == 0) return res;

        return calculateString(count - 1, res+forFind, forFind);
    }
    static void shiftCharacter(String str1, int idx, char forMove, int count, String res) {
        //base case
        if (idx == str1.length()) {
            System.out.println(calculateString(count, res, forMove));
            return;
        }
        // condition for increasing count of given char in given String
        if (str1.charAt(idx) == forMove) {
            count++;
        }
        else res += str1.charAt(idx);
        shiftCharacter(str1, idx + 1, forMove, count, res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = sc.next();
        System.out.println("Enter a character which you want to move last in string");
        char forMove = sc.next().charAt(0);

        shiftCharacter(str1, 0, forMove, 0, "");
    }
}

// End
