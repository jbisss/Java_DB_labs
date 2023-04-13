package olegpoprosil.mergesort.src.mergesort;

import java.util.Arrays;
import java.util.Random;

public class MyMergeSort {

    public static void main(String[] args) {
        Random rand = new Random();

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt() * 100;
        }
        System.out.println("Array: ");
        printArray(arr);
        MyMergeSort sort = new MyMergeSort();
        sort.sort(arr, 0, arr.length - 1);
        System.out.println("Sorted array:");
        printArray(arr);
    }

    void mergeSort(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;
        int[] first = new int[n1];
        int[] second = new int[n2];
        for (int i = 0; i < n1; ++i) {
            first[i] = array[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            second[j] = array[middle + 1 + j];
        }
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (first[i] <= second[j]) {
                array[k] = first[i];
                i++;
            } else {
                array[k] = second[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = first[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = second[j];
            j++;
            k++;
        }
    }

    void sort(int[] array, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(array, l, m);
            sort(array, m + 1, r);
            mergeSort(array, l, m, r);
        }

    }

    static void printArray(int[] array) {
        System.out.print(Arrays.toString(array));
        System.out.println();
    }
}	
