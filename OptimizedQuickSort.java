/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package OptimizedQuickSort;

/**
 *
 * @author Prabashi
 */
/*
 * Optimized Quick Sort Algorithm
 * Uses middle element as pivot
 */
public class OptimizedQuickSort {

    public static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }

    private static int partition(int[] array, int low, int high) {
        int mid = (low + high) / 2;
        int pivot = array[mid];

        // Move pivot to end
        swap(array, mid, high);

        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void displayArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {25, 10, 30, 15, 50, 5};

        System.out.print("Original Array: ");
        displayArray(numbers);

        quickSort(numbers, 0, numbers.length - 1);

        System.out.print("Sorted Array: ");
        displayArray(numbers);
    }
}

