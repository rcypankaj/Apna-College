package FunctionsMethods;

import java.util.Scanner;

/* a function that takes in age as input and returns if that person is eligible to vote or not.
 A person of age > 18 is eligible to vote
 */
// Start
public class checkEligibility {
    static boolean isEligible(int age) {
        if (age > 18) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (isEligible(age)) System.out.println("This person is Eligible to vote");
        else System.out.println("This person is not Eligible to vote");
    }
}
