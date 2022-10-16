package Strings;

import java.util.Scanner;
// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

// Start
public class CumulativeLength {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of string array");
        int size = sc.nextInt();
        String[] s1 = new String[size];
        int length = 0;
        for (int i = 0; i < size; i++) {
            s1[i] = sc.next();
            length += s1[i].length();
        }
        System.out.println(length);

    }
}

// End
