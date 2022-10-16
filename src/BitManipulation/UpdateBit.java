package BitManipulation;

import java.util.Scanner;
// Update Bit
// Start
public class UpdateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println("Enter the position");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        int res = n & bitMask;
        if (res != 0) {
            int newBitMask = ~bitMask;
            int newNumber = n & newBitMask;
            System.out.println(newNumber);
        } else {
            int newNumber = bitMask | n;
            System.out.println(newNumber);
        }

    }
}

// End
