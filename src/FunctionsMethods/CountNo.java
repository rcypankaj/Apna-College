package FunctionsMethods;

import java.util.Scanner;
/* a program to enter the numbers till the user wants and at the end it should display the count of positive,
     negative and zeros entered.*/
 // Start
public class CountNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pos = 0,  neg = 0, zero = 0;
        int n;
        do{
            System.out.println("Enter a number");
            int a = sc.nextInt();
            if (a == 0) zero++;
            else if (a > 0) pos++;
            else neg++;
            System.out.println("Press Enter to continue or 0 to stop");
            n = sc.nextInt();
        } while (n == 1);
        System.out.println("Posotive= " + pos+ "\nNegative= "+ neg+ "\nZero = "+zero);
    }
}

// End
