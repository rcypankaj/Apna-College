package Recursion;

import java.util.Scanner;
// Place tiles of size 1*m in a floor of size n*m
// Start
public class TilingProblem {
    public static int totalPaths(int n, int m) {
        // base case
        if (n == m) return 2;
        if (n < m) return 1;

        // for horizontal placement
        int horPlacement = totalPaths(n - 1 , m);

        // for vertical placement
        int verPlacement = totalPaths(n - m, m);

        return horPlacement + verPlacement;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(totalPaths(n,m));
    }
}
// End
