/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class SwitchEx1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int month;
        System.out.println("Enter the month number: ");
        month = in.nextInt();
        switch (month){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Incorrect month");
            }
            String[] arr = new String[]{"January", "February", "March",
                    "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            int[] arr_1 = new int[12];
            for (int i = 12; i > 0; i--){
                if(i % 2 == 0) {
                    System.out.println(arr[i - 1]);
                } else {
                    System.out.println(i);
                }
            }

        }
}
