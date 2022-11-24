package LinkedList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
// Start
public class CollectionMethodForReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();

        //input
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        System.out.println(list);

        //reverse
        Collections.reverse(list);
        System.out.println(list);
    }
}

// End