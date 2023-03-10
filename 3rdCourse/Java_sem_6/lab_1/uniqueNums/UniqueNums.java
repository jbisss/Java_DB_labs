package uniqueNums;

import java.util.Scanner;

public class UniqueNums {
    public static void main(String[] args){
        int[] numbers = new int[5];
        Scanner scanner = new Scanner(System.in);
        int num=0, numValues=0;
        boolean valid = true;

        while(numValues<numbers.length){
            do {
                valid = true;
                System.out.print("Введите число: ");

                num = scanner.nextInt();
                for (int i = 0; i < numValues; i++) {
                    if (num == numbers[i]) {
                        System.out.println("Такое число уже есть!");
                        valid = false;
                        break;
                    }
                }
            }while(!valid);
            numbers[numValues]=num;
            numValues++;
        }
        scanner.close();
        for(int number: numbers){
            System.out.println("Число: "+number);
        }
    }
}
