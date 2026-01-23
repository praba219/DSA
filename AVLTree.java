/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AVLTree;

/**
 *
 * @author Prabashi
 */
/*
 * AVL Tree Implementation
 * Self-balancing Binary Search Tree
 */
public class AVLTree {

    // Node definition
    class Node {
        int data;
        int height;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            height = 1;
        }
    }

    private Node root;

    // INSERT operation
    public void insert(int value) {
        root = insertRecursive(root, value);
        System.out.println("Inserted: " + value);
    }

    private Node insertRecursive(Node node, int value) {

        if (node == null) {
            return new Node(value);
        }

        if (value < node.data) {
            node.left = insertRecursive(node.left, value);
        } else if (value > node.data) {
            node.right = insertRecursive(node.right, value);
        } else {
            return node;
        }

        // Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Get balance factor
        int balance = getBalance(node);

        // Left Left Case
        if (balance > 1 && value < node.left.data) {
            return rightRotate(node);
        }

        // Right Right Case
        if (balance < -1 && value > node.right.data) {
            return leftRotate(node);
        }

        return node;
    }

    // RIGHT rotation
    private Node rightRotate(Node y) {
        Node x = y.left;
        Node t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    // LEFT rotation
    private Node leftRotate(Node x) {
        Node y = x.right;
        Node t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    private int height(Node node) {
        return node == null ? 0 : node.height;
    }

    private int getBalance(Node node) {
        return node == null ? 0 : height(node.left) - height(node.right);
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
        System.out.print("AVL Tree Inorder Traversal: ");
        inorderTraversal(root);
        System.out.println();
    }

    public static void main(String[] args) {
        AVLTree avl = new AVLTree();

        avl.insert(10);
        avl.insert(20);
        avl.insert(30);
        avl.insert(40);
        avl.insert(50);

        avl.displayInorder();
    }
}
