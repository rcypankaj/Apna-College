package FunctionsMethods;

import java.util.Scanner;

public class Table {
    static void printTable(int a, int idx) {
        System.out.print(a * idx+ " ");
        if (idx == 10) return;
        printTable(a, idx + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        printTable(n, 1);
    }
}
