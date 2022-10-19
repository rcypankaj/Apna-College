package Recursion;

import java.util.Scanner;
// Find the number of ways in which you can invite n people to your party, single or in pairs.
// Start
public class FriendsPair {
    static int countWays(int n) {
        // base case
        if (n <= 1) return 1;

        return countWays(n-1) + (n-1) * countWays(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countWays(n));
    }
}
// End
