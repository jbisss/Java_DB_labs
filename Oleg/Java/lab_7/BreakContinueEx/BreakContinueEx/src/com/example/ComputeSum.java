package com.example;

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int sum_1 = 0;
        int number_1 = 0;
        do {
            sum_1 += number_1;
            System.out.print("Enter a number (-1 to quit): ");
            number_1 = console.nextInt();
            if (number_1 == 0) break;
        } while (true);
        System.out.println("The sum is " + sum_1);

    }
}
