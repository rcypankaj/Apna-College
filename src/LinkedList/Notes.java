package LinkedList;

import java.util.LinkedList;
// Start
public class Notes {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.addFirst(0);
        list.addLast(4);
        System.out.println(list);

        // delete index
        list.remove(0);
        System.out.println(list);

        // size
        System.out.println(list.size());
    }
}

// End
