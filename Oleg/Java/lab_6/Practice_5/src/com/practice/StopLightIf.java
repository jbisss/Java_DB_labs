package com.practice;

import java.util.Scanner;

public class StopLightIf {
    public static void main(String[] args) {
        int currentColor;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a color code");
        currentColor = in.nextInt();
        if (currentColor == 1) {
            System.out.println("Next traffic light is green");
        } else if (currentColor == 2) {
            System.out.println("Next traffic light is yellow");
        } else if (currentColor == 3) {
            System.out.println("Next traffic light is red");
        } else {
            System.out.println("Invalid color");
        }
    }
}
