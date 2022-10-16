package FunctionsMethods;

import java.util.Scanner;
// 3 numbers average
// Start
public class AverageOfThreeNo {
    static void average(int a, int b, int c) {
        System.out.println((a + b + c)/3);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        average(a,b,c);
    }
}

// End
