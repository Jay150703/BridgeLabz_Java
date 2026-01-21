package dsa.linkedlist.doubly;

/*
 * Doubly Linked List Implementation
 * ----------------------------------
 * This program demonstrates a Doubly Linked List
 * where each node contains:
 * - Data
 * - Reference to previous node
 * - Reference to next node
 *
 * Allows traversal in both directions.
 */

public class DoublyLinkedList {

    /* ---------- Node Definition ---------- */
    static class Node {
        int data;
        Node prev;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Head of the doubly linked list
    private Node head;

    /* ---------- Insert Operation ---------- */

    // Insert node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If list is empty
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.prev = temp;
    }

    /* ---------- Display Operations ---------- */

    // Forward traversal
    public void displayForward() {
        Node temp = head;
        System.out.print("Forward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Backward traversal
    public void displayBackward() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    /* ---------- Main Method ---------- */

    public static void main(String[] args) {

        DoublyLinkedList list = new DoublyLinkedList();

        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);

        list.displayForward();
        list.displayBackward();
    }
}
