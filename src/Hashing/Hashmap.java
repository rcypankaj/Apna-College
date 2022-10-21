package Hashing;
import java.util.*;
/* Time Complexity
    Worst case O(n)
    Best Case O(1)
    Average case O(1)
 */
// Start
public class Hashmap {
    public static void main(String[] args) {
        // Country(Key), Population(Value)
        HashMap<String, Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 120);
        map.put("China", 150);
        map.put("US", 30);

        System.out.println(map);
        map.put("US", 50);
        System.out.println(map);

        // search
        if (map.containsKey("China"))
            System.out.println("Key is present in the map");
        else System.out.println("Key is not present in the map");

        // for get
        System.out.println(map.get("India"));
        System.out.println(map.get("Vietnam"));

        int[] arr = {1,2,3,4,5,6,7,8,9};
        // Here are two types to determining loop
        // Ist is
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        // Second Which we use in hashmap
        for (int val: arr) {
            System.out.print(val+ " ");
        }
        System.out.println();

        // Iteration 1
        for (Map.Entry<String, Integer> e: map.entrySet()) {
            System.out.println(e.getKey()+" "+ e.getValue());
        }

        // Iteration 2
        Set<String> keys = map.keySet();
        for (String key: keys) {
            System.out.println(key+" "+ map.get(key));
        }

        // remove
        map.remove("China");
        System.out.println(map);
    }
}

// End
