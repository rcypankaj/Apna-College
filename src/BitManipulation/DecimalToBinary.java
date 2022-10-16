package BitManipulation;

import java.util.Scanner;
// A functions => decimalToBinary() ,  convert a number from one number system to another
// Start
public class DecimalToBinary {
    static String conversion(int n) {
        String res = "";
        while (n > 0) {
            int bitMask = n & 1;
            res += bitMask;
            n = n>>1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String res = conversion(n);

        for (int i = res.length() - 1; i >= 0; i--)
            System.out.print(res.charAt(i));
    }
}

// End
