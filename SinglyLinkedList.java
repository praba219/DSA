/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SinglyLinkedList;

/**
 *
 * @author Prabashi
 */
/*
 * Singly Linked List Implementation
 */
public class SinglyLinkedList {

    // Node definition
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public SinglyLinkedList() {
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
    }

    // DELETE by value
    public void delete(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        if (head.data == value) {
            head = head.next;
            System.out.println("Deleted: " + value);
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != value) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found.");
        } else {
            current.next = current.next.next;
            System.out.println("Deleted: " + value);
        }
    }

    // DISPLAY list
    public void display() {
        System.out.print("Linked List: ");
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(1);
        list.insert(3);
        list.insert(5);

        list.display();
        list.delete(3);
        list.display();
    }
}

