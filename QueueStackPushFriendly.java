/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QueueStackPushFriendly;

/**
 *
 * @author Prabashi
 */
import java.util.LinkedList;
import java.util.Queue;

import java.util.LinkedList;
import java.util.Queue;

/*
 * QueueStack - Push Friendly
 * Push Operation: O(1)
 * Pop Operation: O(n)
 *
 * Stack implemented using two Queues
 */
public class QueueStackPushFriendly {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public QueueStackPushFriendly() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // PUSH operation (O(1))
    public void push(int value) {
        System.out.println("Pushing: " + value);
        queue1.offer(value);
    }

    // POP operation (O(n))
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }

        // Move elements except last
        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        int poppedElement = queue1.poll();
        System.out.println("Popped: " + poppedElement);

        // Swap queues
        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return poppedElement;
    }

    // TOP operation
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty. No top element.");
            return -1;
        }

        while (queue1.size() > 1) {
            queue2.offer(queue1.poll());
        }

        int topElement = queue1.peek();
        queue2.offer(queue1.poll());

        Queue<Integer> temp = queue1;
        queue1 = queue2;
        queue2 = temp;

        return topElement;
    }

    // EMPTY check
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    // MAIN method for testing
    public static void main(String[] args) {
        QueueStackPushFriendly stack = new QueueStackPushFriendly();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top Element: " + stack.top());
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
