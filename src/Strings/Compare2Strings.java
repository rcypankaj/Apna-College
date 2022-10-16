package Strings;

import java.util.Scanner;
// Compare 2 strings

// Start
public class Compare2Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

        if (str1.equals(str2)) System.out.println("They are the same strings");
        else System.out.println("They are different strings");

        // Do not use == for comparing string
        // Gives correct answer here

        String s1 = "Tony";
        String s2 = "Tony";
        if (s1 == s2) System.out.println("They are the same strings");
        else System.out.println("They are different strings");

        // Gives incorrect answer here
        if (new String("Tony") == new String("Tony"))
            System.out.println("They are the same strings");
        else System.out.println("They are different strings");


    }
}

// End
