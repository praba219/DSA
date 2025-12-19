/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ArrayCircularQueue;

/**
 *
 * @author Prabashi
 */
/*
 * Array Circular Queue Implementation
 */
public class ArrayCircularQueue {

    private int[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public ArrayCircularQueue(int capacity) {
        this.capacity = capacity;
        queueArray = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    // ENQUEUE operation
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }

        rear = (rear + 1) % capacity;
        queueArray[rear] = value;
        size++;

        System.out.println("Enqueued: " + value);
    }

    // DEQUEUE operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int removedElement = queueArray[front];
        front = (front + 1) % capacity;
        size--;

        System.out.println("Dequeued: " + removedElement);
        return removedElement;
    }

    // PEEK operation
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return queueArray[front];
    }

    // EMPTY check
    public boolean isEmpty() {
        return size == 0;
    }

    // FULL check
    public boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        ArrayCircularQueue queue = new ArrayCircularQueue(5);

        queue.enqueue(11);
        queue.enqueue(22);
        queue.enqueue(33);

        queue.dequeue();
        queue.enqueue(44);
        queue.enqueue(55);
    }
}

