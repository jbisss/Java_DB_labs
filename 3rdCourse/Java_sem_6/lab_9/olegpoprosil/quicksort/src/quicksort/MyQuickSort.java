package olegpoprosil.quicksort.src.quicksort;

import java.util.Arrays;
import java.util.Random;

public class MyQuickSort {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        System.out.println("Array: ");
        printArray(arr);
        System.out.println();
        quickSort(arr, 0, arr.length - 1);
        System.out.println();
        System.out.println("Sorted array:");
        printArray(arr);
    }
    static int shag = 0;
    public static void quickSort(int[] arr, int left, int right) {
        shag++;
        System.out.print(shag + " [");
        for(int i = left; i < right; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]");
        System.out.println();
        if (left < right) {
            shag++;
            int pivotIndex = partition(arr, left, right);
            System.out.print(shag + " [");
            for(int i = left; i < right; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.print("]");
            System.out.println(" + pivot " + arr[pivotIndex]);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println("swap: " + arr[i] + " with " + arr[j]);
    }

    static void printArray(int[] array) {
        System.out.print(Arrays.toString(array));
        System.out.println();
    }
}
