package com.practice;

import java.util.Scanner;

public class StopLightSwitch {
    public static void main(String[] args) {
        int currentColor;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a color code");
        currentColor = in.nextInt();
        switch (currentColor) {
            case 1:
                System.out.println("Next traffic light is green");
                break;
            case 2:
                System.out.println("Next traffic light is yellow");
                break;
            case 3:
                System.out.println("Next traffic light is red");
                break;
            default:
                System.out.println("Invalid color");
                break;
        }
    }
}
