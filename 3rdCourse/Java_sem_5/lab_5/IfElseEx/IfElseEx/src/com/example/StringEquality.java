/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

/**
 *
 * @author anshenoy
 */

import java.util.Random;
import java.util.Scanner;
public class StringEquality {
    public static void main(String[] args) {
        String name;
        Scanner in = new Scanner(System.in);
        name = in.nextLine();
        if (name.equals("Мое")) {
            System.out.println("Вы король рок-н-ролла");
        } else {
            System.out.println("Вы не король");
        }
    }
}

