package dsa.linear.queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Queue Basics using Java Queue interface
 */

public class QueueBasics {

    private Queue<Integer> queue = new LinkedList<>();

    public void enqueue(int data) {
        queue.offer(data);
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            throw new RuntimeException("Queue Underflow");
        }
        return queue.poll();
    }

    public int peek() {
        return queue.peek();
    }

    public static void main(String[] args) {
        QueueBasics q = new QueueBasics();
        q.enqueue(10);
        q.enqueue(20);

        System.out.println(q.dequeue());
        System.out.println(q.peek());
    }
}
