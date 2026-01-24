package dsa.linear.hashmap;

/*
 * Custom HashMap using Separate Chaining
 */

public class CustomHashMap {

    static class Node {
        int key, value;
        Node next;

        Node(int k, int v) {
            key = k;
            value = v;
        }
    }

    private final int SIZE = 10;
    private Node[] table = new Node[SIZE];

    private int hash(int key) {
        return key % SIZE;
    }

    public void put(int key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);

        if (table[index] == null) {
            table[index] = newNode;
            return;
        }

        Node temp = table[index];
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public int get(int key) {
        int index = hash(key);
        Node temp = table[index];

        while (temp != null) {
            if (temp.key == key) return temp.value;
            temp = temp.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        CustomHashMap map = new CustomHashMap();
        map.put(1, 100);
        map.put(11, 200);

        System.out.println(map.get(1));
        System.out.println(map.get(11));
    }
}
