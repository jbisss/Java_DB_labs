package com.task_2;

import java.util.Scanner;

public class MultiTable {
    public static void main(String[] args) {
        int number = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number:");
        number = in.nextInt();
        for (int i = 0; i < 12; i++){
            System.out.println(i + 1 + " * " + number + " = " + (i + 1) * number);
        }
    }
}
