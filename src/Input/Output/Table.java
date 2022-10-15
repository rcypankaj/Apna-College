package Input.Output;

//print table of a number
//start
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = sc.nextInt();

        //loop for print table
        for (int i = 1; i <= 10; i++) {
            System.out.print(a * i+ " ");
        }
    }
}

// end