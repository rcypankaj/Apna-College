package Recursion;

import java.util.Scanner;
// CountPathMaze
// Time Complexity -> O(2^(m + n))
// Start
public class CountPathMaze {
    static int countPaths(int i, int j, int n, int m) {
        // base case
        if (i == n || j == m)
            return 0;
        if (i == n-1 && j == m-1)
            return 1;
        int rightPath = countPaths(i, j + 1, n ,m);
        int downPaths = countPaths(i+1, j, n, m);
        return rightPath + downPaths;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(countPaths(0,0,n,m));
    }
}

// End