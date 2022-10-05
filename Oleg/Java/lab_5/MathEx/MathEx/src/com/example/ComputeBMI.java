/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;


public class ComputeBMI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter weight:");
        double weight = in.nextDouble();
        System.out.println("Enter height:");
        double height = in.nextDouble();
        double bmi = (weight/Math.pow(height, 2))*703;
        System.out.println("Your BMI is " + Math.round(bmi));
    }
}
