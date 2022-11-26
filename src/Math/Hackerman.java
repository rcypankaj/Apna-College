package Math;
import java.util.Scanner;
// Question URL: https://www.codechef.com/problems/PRIMEDICE?tab=statement
// Start
public class Hackerman {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            boolean flag = true;

            a = a+b;
            for (int i = 2; i <= a/2; i++) {
                if (a%i == 0){
                    System.out.println("Bob");
                    flag = false;
                    break;
                }
            }
            if (flag)
                System.out.println("Alice");
        }
    }
}

// End