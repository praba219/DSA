/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BinarySearchTree;

/**
 *
 * @author Prabashi
 */
/*
 * Binary Search Tree Implementation
 */
public class BinarySearchTree {

    // Node definition
    class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    // INSERT operation
    public void insert(int value) {
        root = insertRecursive(root, value);
        System.out.println("Inserted: " + value);
    }

    private Node insertRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }

        if (value < current.data) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.data) {
            current.right = insertRecursive(current.right, value);
        }

        return current;
    }

    // INORDER traversal
    public void inorderTraversal(Node node) {
        if (node != null) {
            inorderTraversal(node.left);
            System.out.print(node.data + " ");
            inorderTraversal(node.right);
        }
    }

    public void displayInorder() {
        System.out.print("Inorder Traversal: ");
        inorderTraversal(root);
        System.out.println();
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        bst.displayInorder();
    }
}

