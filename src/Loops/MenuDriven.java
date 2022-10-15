package Loops;
import java.util.Scanner;

/* menu driven program
   The user can enter 2 numbers, either 1 or 0.
   If the user enters 1 then keep taking input from the user for a student’s marks(out of 100).
   If they enter 0 then stop.*/
//start

public class MenuDriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        do {
            System.out.println("Enter the marks");
            int marks = sc.nextInt();
            if (marks >= 90 && marks <= 100) System.out.println("This is good");
            else if (marks <= 89 && marks >= 60) System.out.println("This is also good");
            else if (marks <= 59 && marks >= 0) System.out.println("This is Good as well");
            else System.out.println("Enter the valid marks");

            System.out.println("Press 1 to continue or 0 to stop");
            a = sc.nextInt();
        }while (a == 1);
    }
}

// end
