package BitManipulation;

import java.util.Scanner;
// Set Bit
// Start
public class SetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println("Enter the position");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        int newNumber = n | bitMask;

        System.out.println(newNumber);
    }

}

// End
