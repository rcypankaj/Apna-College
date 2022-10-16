package BitManipulation;

import java.util.Scanner;
// A functions => binaryToDecimal() ,  convert a number from one number system to another
// Start
public class BinaryToDecimal {
    static int conversion(int n) {
        int count = 0, res = 0;
        while (n > 0) {
            int bitMask = (n%10) & 1;
            if (bitMask != 0) {
                res += calculatePower(count);
            }
            count++;
            n = n/10;
        }
        return res;
    }
    static int calculatePower (int count) {
        if (count == 0) return 1;
        return 2 * calculatePower(count - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(conversion(n));
    }
}

// End
