/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package InsertionSort;

/**
 *
 * @author Prabashi
 */
/*
 * Insertion Sort Algorithm
 */
public class InsertionSort {

    // Insertion sort method
    public static void insertionSort(int[] array) {
        int length = array.length;

        for (int index = 1; index < length; index++) {
            int currentValue = array[index];
            int previousIndex = index - 1;

            // Shift elements greater than currentValue
            while (previousIndex >= 0 && array[previousIndex] > currentValue) {
                array[previousIndex + 1] = array[previousIndex];
                previousIndex--;
            }

            array[previousIndex + 1] = currentValue;
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
        int[] numbers = {12, 11, 13, 5, 6};

        System.out.print("Original Array: ");
        displayArray(numbers);

        insertionSort(numbers);

        System.out.print("Sorted Array: ");
        displayArray(numbers);
    }
}

