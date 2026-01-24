package dsa.linear.stack;

import java.util.Deque;
import java.util.ArrayDeque;

/*
 * Stack Basics using Deque
 * Supports push, pop, peek operations
 */

public class StackBasics {

    private Deque<Integer> stack = new ArrayDeque<>();

    public void push(int data) {
        stack.push(data);
    }

    public int pop() {
        if (stack.isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return stack.pop();
    }

    public int peek() {
        return stack.peek();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        StackBasics s = new StackBasics();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
