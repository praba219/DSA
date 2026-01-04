/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package CircularDoublyLinkedList;

/*
 * Circular Doubly Linked List Implementation
 */
public class CircularDoublyLinkedList {

    // Node definition
    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
        }
    }

    private Node head;

    public CircularDoublyLinkedList() {
        head = null;
    }

    // INSERT at end
    public void insert(int value) {
        System.out.println("Inserting: " + value);
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
            return;
        }

        Node last = head.prev;

        newNode.next = head;
        newNode.prev = last;
        last.next = newNode;
        head.prev = newNode;
    }

    // DISPLAY list
    public void display() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        System.out.print("Circular Doubly Linked List: ");
        Node temp = head;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList list = new CircularDoublyLinkedList();

        list.insert(19);
        list.insert(28);
        list.insert(37);

        list.display();
    }
}

