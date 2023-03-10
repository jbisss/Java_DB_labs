package com.example;

import java.util.Scanner;

public class SquareRootWhile {
    public static void main(String args[]) {
        System.out.print("Type a non-negative integer: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        while (number < 0) {
            System.out.println("Incorrect number, type again:");
            number = console.nextInt();
        }
        System.out.println(Math.sqrt(number));
    }
}
