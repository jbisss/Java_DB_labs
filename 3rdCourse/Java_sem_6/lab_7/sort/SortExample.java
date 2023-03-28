package sort;

import java.security.spec.RSAOtherPrimeInfo;

public class SortExample {
    public static void main(String[] args) {
        int[] numbers = {40, 7, 59, 4, 1};
        displayValues(numbers);
        /*selectionSort(numbers);
        displayValues(numbers);*/

        /*bubbleSort(numbers);
        displayValues(numbers);*/

        /*sequentialSearch(numbers, 59);*/

        /*bubbleSort(numbers);
        binarySearch(numbers, 4);*/
    }
    public static int binarySearch(int[] numbers, int value){
        int low = 0;
        int high = numbers.length - 1;
        while(high >= low){
            int middle = (low + high)/2;
            if(numbers[middle] == value){
                System.out.println("The number " + value + " is at position "
                + middle + " in the list");
                return middle;
            }
            if(numbers[middle] < value){
                low = middle + 1;
            }
            if(numbers[middle] > value){
                high = middle - 1;
            }
        }
        System.out.println("The number " + value + " is not in the list");
        return -1;
    }
    public static int sequentialSearch(int[] numbers, int value){
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == value){
                System.out.println("The number " + value + " is at position " + i + " in the list");
                return i;
            }
        }
        System.out.println("The number " + value + " is not in the list");
        return -1;
    }

    public static void bubbleSort(int[] numbers){
        for(int j = 0; j < numbers.length; j++){
            boolean flag = false;
            for(int i = 0; i < numbers.length - 1; i++){
                if(numbers[i] > numbers[i+1]){
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;
                    flag = true;
                }
            }
            if(!flag){
                return;
            }
        }
    }
    public static void selectionSort(int[] numbers){
        int indexMin = 0;
        for(int i = 0; i < numbers.length;i++){
            indexMin = i;
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[j] < numbers[indexMin]){
                    indexMin = j;
                }
            }
            int temp = numbers[i];
            numbers[i] = numbers[indexMin];
            numbers[indexMin] = temp;
        }
    }
    public static void displayValues(int[] numbers){
        for(int i = 0; i  < numbers.length; i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");
    }
}
