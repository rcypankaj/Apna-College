package Recursion;

import java.util.ArrayList;
import java.util.Scanner;
// Print all the subSets of a set of first n Natural Numbers
// Time Complexity -> O(2^n)
// Start
public class SubsetOfSet {
    static void printSubSet(ArrayList<Integer> subSet) {
        for (int i = 0; i < subSet.size(); i++ ){
            System.out.print(subSet.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subSet) {
        // base case
        if (n == 0) {
            printSubSet(subSet);
            return;
        }

        // either add in subset
        subSet.add(n);
        findSubsets(n - 1, subSet);

        // either not add
        subSet.remove(subSet.size() - 1);
        findSubsets(n - 1, subSet);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> subSet = new ArrayList<>();
        findSubsets(n, subSet);
    }
}

// End
