package com.practice;

import java.util.Scanner;

public class ColorRange {
    public static void main(String[] args) {
        double waveLength;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the wavelength");
        waveLength = in.nextDouble();
        if (waveLength >= 380 && waveLength < 450) {
            System.out.println("The color is Violet");
        } else if (waveLength >= 450 &&waveLength < 495) {
            System.out.println("The color is Blue");
        } else if (waveLength >= 495 &&waveLength < 570) {
            System.out.println("The color is Green");
        } else if (waveLength >= 570 &&waveLength < 590) {
            System.out.println("The color is yellow");
        } else if (waveLength >= 590 &&waveLength < 620) {
            System.out.println("The color is Orange");
        } else if (waveLength >= 620 &&waveLength < 750) {
            System.out.println("The color is Red");
        } else {
            System.out.println("The entered wavelength is not a part of visible spectrum");
        }
    }
}
