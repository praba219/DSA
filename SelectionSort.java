/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package SelectionSort;

/**
 *
 * @author Prabashi
 */
/*
 * Selection Sort Algorithm
 */
public class SelectionSort {

    public static void selectionSort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length - 1; i++) {
            int minIndex = i;

            // Find minimum element
            for (int j = i + 1; j < length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {64, 25, 12, 22, 11};

        System.out.print("Original Array: ");
        displayArray(numbers);

        selectionSort(numbers);

        System.out.print("Sorted Array: ");
        displayArray(numbers);
    }
}

