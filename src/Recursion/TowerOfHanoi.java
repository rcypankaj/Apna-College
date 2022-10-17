package Recursion;

import java.util.Scanner;
// Tower of Hanoi - Transfer n disks from source to destination over 3 towers.
// Time Complexity -> O(2^n)
// Start
public class TowerOfHanoi {
    static void printTOH(int n, String src, String helper, String dest) {
        // base case
        if (n == 1) {
            System.out.println("Transfer disk" + n + " from " + src + " to " + dest);
            return;
        }

        // //transfer top n-1 from src to helper using dest as 'helper'
        printTOH(n - 1, src,dest, helper);

        //transfer nth from src to dest
        System.out.println("Transfer disk"+n+" from "+ src+" to "+ dest);

        //transfer n-1 from helper to dest using src as 'helper'
        printTOH(n - 1, helper, src, dest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of disk");
        int n = sc.nextInt();
        printTOH(n, "S", "H", "D");

    }
}

// End
