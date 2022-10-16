package Strings;

import java.util.Scanner;
/* Input a string from the user.
Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. */
// Start
public class ReplacingCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strings");

        String str = sc.next();
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'i') res += 'e';
            else res += str.charAt(i);
        }
        System.out.println(res);
    }
}

// End
