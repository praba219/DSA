/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OptimizedInsertionSort;

/**
 *
 * @author Prabashi
 */
/*
 * Optimized Insertion Sort Algorithm
 * Efficient for nearly sorted arrays
 */
public class OptimizedInsertionSort {

    public static void insertionSort(int[] array) {
        int length = array.length;

        for (int i = 1; i < length; i++) {
            int currentValue = array[i];

            // If already in correct position, skip shifting
            if (array[i - 1] <= currentValue) {
                continue;
            }

            int j = i - 1;
            while (j >= 0 && array[j] > currentValue) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = currentValue;
        }
    }

    public static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 3};

        System.out.print("Original Array: ");
        displayArray(numbers);

        insertionSort(numbers);

        System.out.print("Sorted Array: ");
        displayArray(numbers);
    }
}

