/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package QueueStackPopFriendly;

/**
 *
 * @author Prabashi
 */
import java.util.LinkedList;
import java.util.Queue;

/*
 * QueueStack - Pop Friendly
 * Push Operation: O(n)
 * Pop Operation: O(1)
 */
public class QueueStackPopFriendly {

    private Queue<Integer> queue1;
    private Queue<Integer> queue2;

    public QueueStackPopFriendly() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // PUSH operation (O(n))
    public void push(int value) {
        System.out.println("Pushing: " + value);

        // Move all elements to queue2
        while (!queue1.isEmpty()) {
            queue2.offer(queue1.poll());
        }

        queue1.offer(value);

        // Move back all elements
        while (!queue2.isEmpty()) {
            queue1.offer(queue2.poll());
        }
    }

    // POP operation (O(1))
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }

        int poppedElement = queue1.poll();
        System.out.println("Popped: " + poppedElement);
        return poppedElement;
    }

    // TOP operation
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return queue1.peek();
    }

    // EMPTY check
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    public static void main(String[] args) {
        QueueStackPopFriendly stack = new QueueStackPopFriendly();

        stack.push(5);
        stack.push(15);
        stack.push(25);

        System.out.println("Top Element: " + stack.top());
        stack.pop();
        stack.pop();
        stack.pop();
    }
}

