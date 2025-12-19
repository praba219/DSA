/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package DoublyLinkedList;

/**
 *
 * @author Prabashi
 */
/*
 * Doubly Linked List Implementation
 */
public class DoublyLinkedList {

    // Node definition
    class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    public DoublyLinkedList() {
        head = null;
    }

    // INSERT at end
    public void insert(int value) {
        System.out.println("Inserting: " + value);
        Node newNode = new Node(value);

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

    // DELETE by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;

        while (temp != null && temp.data != value) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Value not found.");
            return;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        } else {
            head = temp.next;
        }

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        System.out.println("Deleted: " + value);
    }

    // DISPLAY forward
    public void displayForward() {
        System.out.print("Forward: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // DISPLAY backward
    public void displayBackward() {
        if (head == null) return;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        System.out.print("Backward: ");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.insert(5);
        list.insert(10);
        list.insert(15);

        list.displayForward();
        list.displayBackward();

        list.delete(10);
        list.displayForward();
    }
}

