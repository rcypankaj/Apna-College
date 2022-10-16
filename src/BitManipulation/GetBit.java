package BitManipulation;

import java.util.Scanner;
// Get Bit
// Start
public class GetBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();

        System.out.println("Enter the position");
        int pos = sc.nextInt();
        int bitMask = 1 << pos;
        int res = n & bitMask;
        
        if (res != 0) System.out.println("bit was one");
        else System.out.println("bit was zero");


    }
}

// End
