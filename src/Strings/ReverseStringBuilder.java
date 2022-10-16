package Strings;

import java.util.Scanner;
// Reverse StringBUilder
// Start
public class ReverseStringBuilder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder("");
        sb.append(sc.next());

        for (int i = sb.length() - 1; i >= 0; i--) {
            System.out.print(sb.charAt(i));
        }
    }
}
// End