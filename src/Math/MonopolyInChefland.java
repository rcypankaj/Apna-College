package Math;
import java.util.Scanner;
// Question URL: https://www.codechef.com/problems/MONOPOLY
// Start
public class MonopolyInChefland {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if (a+b < c || b > a+c || a > b + c)
                System.out.println("Yes");
            else System.out.println("No");
        }
    }
}

// End