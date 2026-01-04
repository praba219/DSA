/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package LinkedListStack;

/**
 *
 * @author Prabashi
 */
/*
 * Stack Implementation using Linked List
 */
public class LinkedListStack {

    // Node definition
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node top;

    public LinkedListStack() {
        top = null;
    }

    // PUSH operation
    public void push(int value) {
        System.out.println("Pushing: " + value);
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // POP operation
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }

        int poppedElement = top.data;
        top = top.next;
        System.out.println("Popped: " + poppedElement);
        return poppedElement;
    }

    // TOP operation
    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return top.data;
    }

    // EMPTY check
    public boolean isEmpty() {
        return top == null;
    }

    public static void main(String[] args) {
        LinkedListStack stack = new LinkedListStack();

        stack.push(5);
        stack.push(15);
        stack.push(25);

        stack.pop();
        stack.pop();
    }
}

