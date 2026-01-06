/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TowerOfHanoi;

/**
 *
 * @author Prabashi
 */
/*
 * Tower of Hanoi Problem
 * Recursive solution
 */
public class TowerOfHanoi {

    // Recursive method to solve Tower of Hanoi
    public static void solveHanoi(int numberOfDisks, char sourceRod, char auxiliaryRod, char destinationRod) {

        // Base case
        if (numberOfDisks == 1) {
            System.out.println("Move disk 1 from " + sourceRod + " to " + destinationRod);
            return;
        }

        // Move n-1 disks from source to auxiliary
        solveHanoi(numberOfDisks - 1, sourceRod, destinationRod, auxiliaryRod);

        // Move nth disk to destination
        System.out.println("Move disk " + numberOfDisks + " from " + sourceRod + " to " + destinationRod);

        // Move n-1 disks from auxiliary to destination
        solveHanoi(numberOfDisks - 1, auxiliaryRod, sourceRod, destinationRod);
    }

    public static void main(String[] args) {
        int numberOfDisks = 3;

        System.out.println("Tower of Hanoi solution for " + numberOfDisks + " disks:");
        solveHanoi(numberOfDisks, 'A', 'B', 'C');
    }
}

