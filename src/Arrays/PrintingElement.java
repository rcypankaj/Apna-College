package Arrays;

import java.util.Scanner;
//Take an array of names as input from the user and print them on the screen.
// Start
public class PrintingElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = {1,2,3,4,5};
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");

        // Second way
        int n = sc.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i]+ " ");
        }
    }
}

// End
