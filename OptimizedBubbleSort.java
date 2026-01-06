/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OptimizedBubbleSort;

/**
 *
 * @author Prabashi
 */
/*
 * Optimized Bubble Sort Algorithm
 */
public class OptimizedBubbleSort {

    public static void bubbleSort(int[] array) {
        int length = array.length;
        boolean swapped;

        for (int pass = 0; pass < length - 1; pass++) {
            swapped = false;

            for (int index = 0; index < length - pass - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int temp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = temp;
                    swapped = true;
                }
            }

            // If no swaps, array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {30, 10, 40, 20, 50};

        System.out.print("Original Array: ");
        displayArray(numbers);

        bubbleSort(numbers);

        System.out.print("Sorted Array: ");
        displayArray(numbers);
    }
}

