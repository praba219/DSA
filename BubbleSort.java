/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package BubbleSort;

/**
 *
 * @author Prabashi
 */
/*
 * Bubble Sort Algorithm
 */
public class BubbleSort {

    // Bubble sort method
    public static void bubbleSort(int[] array) {
        int length = array.length;

        for (int pass = 0; pass < length - 1; pass++) {
            for (int index = 0; index < length - pass - 1; index++) {
                if (array[index] > array[index + 1]) {
                    // Swap elements
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                }
            }
        }
    }

    // Display array
    public static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {64, 34, 25, 12, 22, 11, 90};

        System.out.print("Original Array: ");
        displayArray(numbers);

        bubbleSort(numbers);

        System.out.print("Sorted Array: ");
        displayArray(numbers);
    }
}

