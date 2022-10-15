package Input.Output;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        float res = radius * radius;
        System.out.println(res * 3.14);
    }
}