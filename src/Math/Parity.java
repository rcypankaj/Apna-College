package Math;
import java.util.Scanner;
// Question URL: https://www.codechef.com/problems/PAR2
// Start
public class Parity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            if ((n&1) == 1)
                System.out.println("No");
            else System.out.println("Yes");
        }
    }
}
// End