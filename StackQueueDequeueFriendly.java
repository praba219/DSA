/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package StackQueueDequeueFriendly;

/**
 *
 * @author Prabashi
 */
import java.util.Stack;

/*
 * StackQueue - Dequeue Friendly
 * Enqueue Operation: O(n)
 * Dequeue Operation: O(1)
 *
 * Queue implemented using two stacks
 */
public class StackQueueDequeueFriendly {

    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public StackQueueDequeueFriendly() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // ENQUEUE operation (O(n))
    public void enqueue(int value) {
        System.out.println("Enqueuing: " + value);

        // Move all elements to stack2
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        // Push new element
        stack1.push(value);

        // Move back elements
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
    }

    // DEQUEUE operation (O(1))
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int dequeuedElement = stack1.pop();
        System.out.println("Dequeued: " + dequeuedElement);
        return dequeuedElement;
    }

    // PEEK operation
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return stack1.peek();
    }

    // EMPTY check
    public boolean isEmpty() {
        return stack1.isEmpty();
    }

    public static void main(String[] args) {
        StackQueueDequeueFriendly queue = new StackQueueDequeueFriendly();

        queue.enqueue(100);
        queue.enqueue(200);
        queue.enqueue(300);

        queue.dequeue();
        queue.dequeue();
    }
}

