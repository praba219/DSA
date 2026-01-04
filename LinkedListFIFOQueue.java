/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedListFIFOQueue;

/**
 *
 * @author Prabashi
 */
/*
 * FIFO Queue Implementation using Linked List
 */
public class LinkedListFIFOQueue {

    // Node definition
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node front;
    private Node rear;

    public LinkedListFIFOQueue() {
        front = null;
        rear = null;
    }

    // ENQUEUE operation
    public void enqueue(int value) {
        System.out.println("Enqueued: " + value);
        Node newNode = new Node(value);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // DEQUEUE operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1;
        }

        int removedElement = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        System.out.println("Dequeued: " + removedElement);
        return removedElement;
    }

    // EMPTY check
    public boolean isEmpty() {
        return front == null;
    }

    public static void main(String[] args) {
        LinkedListFIFOQueue queue = new LinkedListFIFOQueue();

        queue.enqueue(3);
        queue.enqueue(7);
        queue.enqueue(21);

        queue.dequeue();
        queue.dequeue();
    }
}

