package Strings;

import java.util.Scanner;
/* Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’.
 Display that username to the user. */
// Start
public class Username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Strings");
        String str = sc.next();
        String res = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '@') break;
            else res += str.charAt(i);
        }
        System.out.println(res);
    }
}

// End
