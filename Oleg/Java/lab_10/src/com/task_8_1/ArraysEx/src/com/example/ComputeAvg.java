/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.task_8_1.ArraysEx.src.com.example;

import java.util.Scanner;

public class ComputeAvg {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int[] marks = new int[5];
        int sum = 0;
        for(int i = 0; i < 5; i++){
            marks[i] = in.nextInt();
            sum+=marks[i];
        }
        System.out.println("Average mark is " + sum/5);
    }

}
