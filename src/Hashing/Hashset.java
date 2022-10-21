package Hashing;
import java.util.HashSet;
import java.util.Iterator;
/* Time Complexity
    Best case - O(1)
    Worst case - O(n)
    Average case - O(1)
 */

public class Hashset {
    public static void main(String[] args) {
        // Creating
        HashSet<Integer> set = new HashSet<>();

        // Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(1);

        // search- contains
        if (set.contains(1))
            System.out.println("Set contains 1");
        else System.out.println("Set not contain 1");

        // Negative case
        if(!set.contains(5))
            System.out.println("does not contain 5");

        // Delete
        set.remove(1);
        if (!set.contains(1))
            System.out.println("Does not contain 1- We deleted 1");

        // for print size
        System.out.println("Size of set is: "+set.size());

        // for printing all elements in set
        System.out.println(set);

        // Iterator
        Iterator it = set.iterator();

        //Iteration - HashSet does not have an order
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }
}
