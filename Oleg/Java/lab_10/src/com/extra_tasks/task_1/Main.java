package com.extra_tasks.task_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] array = new int[2][3];
        for (int i = 0; i < 2;i++){
            for(int j = 0; j < 3; j++){
                array[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < 2;i++){
            for(int j = 0; j < 3; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j< 3;j++){
            for(int i = 0; i < 2; i++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
