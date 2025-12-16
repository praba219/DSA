/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StackQueueEnqueueFriendly;

/**
 *
 * @author Prabashi
 */
import java.util.Stack;

/*
 * StackQueue - Enqueue Friendly
 * Enqueue: O(1)
 * Dequeue: O(n)
 */
public class StackQueueEnqueueFriendly {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public StackQueueEnqueueFriendly() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // ENQUEUE operation
    public void enqueue(int value) {
        System.out.println("Enqueued: " + value);
        stack1.push(value);
    }

    // DEQUEUE operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        while (stack1.size() > 1) {
            stack2.push(stack1.pop());
        }

        int dequeuedElement = stack1.pop();
        System.out.println("Dequeued: " + dequeuedElement);

        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }

        return dequeuedElement;
    }

    // EMPTY check
    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        StackQueueEnqueueFriendly queue = new StackQueueEnqueueFriendly();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.dequeue();
        queue.dequeue();
    }
}

