package Strings;

import java.util.Scanner;
// Append a char
// Set a char at Index.
// Start
public class SetAFromStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        System.out.println("Enter a string");
        sb.append(sc.next());
        sb.setCharAt(0, 'L');

        System.out.println(sb);
    }
}

// End
