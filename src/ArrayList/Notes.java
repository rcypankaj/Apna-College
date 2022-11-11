package ArrayList;

import java.util.Collections;
import java.util.ArrayList;
// Start
public class Notes {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Boolean> list3 = new ArrayList<>();

        // Add elemetnts
        list.add(1);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);

        // to get a element
        int element = list.get(0); // 0 is the index
        System.out.println(element);

        // add element in between
        list.add(2, 0); // 2 is the index and 0 is the element to be added
        System.out.println(list);

        // set element
        list.set(1,2);
        list.set(2,3);
        System.out.println(list);

        // delete element
        list.remove(4);
        System.out.println(list);

        // size of the list
        int size = list.size();
        System.out.println(size);

        //loops in list
        for (int i = 0; i < size; i++) {
            System.out.print(list.get(i)+" ");
        }

        //enhanced loops in list
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
        System.out.println();

        // sort the list
        list.add(1,5);
        Collections.sort(list);
        System.out.println(list);
    }
}

// End
