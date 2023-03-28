package practice;

import sort.SortExample;

import java.util.Random;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        int[] array = new int[50];
        for(int i = 0; i < array.length; i++){
            array[i] = new Random().nextInt(100);
        }
        System.out.println("Unordered list");
        SortExample.displayValues(array);

        System.out.println("Enter a number to search");
        Scanner in = new Scanner(System.in);
        int value = in.nextInt();

        System.out.println(SortExample.sequentialSearch(array, value));

        SortExample.bubbleSort(array);
        System.out.println("Ordered list");
        SortExample.displayValues(array);

        System.out.println("Enter a number to search");
        value = in.nextInt();
        System.out.println(SortExample.binarySearch(array, value));
    }
}
