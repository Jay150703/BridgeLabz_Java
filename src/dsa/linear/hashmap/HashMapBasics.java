package dsa.linear.hashmap;

import java.util.HashMap;

/*
 * HashMap basic operations
 */

public class HashMapBasics {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "DSA");

        System.out.println(map.get(1));
        System.out.println(map.containsKey(2));
    }
}
