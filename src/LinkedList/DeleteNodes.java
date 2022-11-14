package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

/* Take elements(numbers in the range of 1-50) of a Linked List as input from the user.
    Delete all nodes which have values greater than 25. */
// Start
public class DeleteNodes {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // input
        for (int i = 0; i < n; i++) {
            int currElement = sc.nextInt();
            if (currElement <= 50 && currElement >= 1)
                list.add(currElement);
        }

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 25) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

    }
}

// End
