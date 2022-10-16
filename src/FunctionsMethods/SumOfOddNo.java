package FunctionsMethods;

import java.util.Scanner;
// a function to print the sum of all odd numbers from 1 to n.
// Start
public class SumOfOddNo {
    static int SumOdd(int n, int idx, int res) {
        if (idx > n)
            return res;
        res += idx;
        return SumOdd(n, idx + 2, res);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println((SumOdd(n, 1, 0)));
    }
}
// End
