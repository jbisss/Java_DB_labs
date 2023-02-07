package uniqueNums;

import java.util.Scanner;

public class UniqueNums {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner in = new Scanner(System.in);
        int num = 0;
        int numValues = 0;
        boolean valid = true;

        while(numValues<numbers.length){
            do {
                valid = true;
                System.out.println("Please enter a unique number: ");
                for(int i =0; i < numValues; i++){
                    if(num==numbers[i]){
                        System.out.println("Numbers already exists");
                        valid = false;
                        break;
                    }
                }
            } while (!valid);
            numbers[numValues] = num;
            numValues++;
        }
        in.close();
        for(int numV : numbers){
            System.out.println(numV);
        }
    }
}
