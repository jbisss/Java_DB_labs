package com.extra_tasks.task_2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void countSum(double[] array){
        double sum = 0.0;
            for (int j = 0; j < array.length; j++){
                System.out.print(array[j] + " ");
                sum+=array[j];
            }
            System.out.print("Sum of line: " + sum + "\n");
    }
    public static void main(String[] args) {
        Random rand = new Random();
        double[][] array = new double[5][];
        for (int i = 0; i < 5; i++){
            array[i] = new double[rand.nextInt(10) + 1];
        }
        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = rand.nextDouble(201)-100;
            }
        }
        for (int i = 0; i < 5; i ++){
            countSum(array[i]);
        }
        double[][] array_1 = new double[5][];
        for(int i = 0; i < 5; i++){
            array_1[i] = Arrays.copyOf(array[i], array[i].length);
            Arrays.sort(array_1[i]);
        }
        System.out.println("-------------------------");
        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        for (int i = 0; i < 5; i ++){
            for (int j = 0; j < array_1[i].length; j++){
                System.out.print(array_1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
