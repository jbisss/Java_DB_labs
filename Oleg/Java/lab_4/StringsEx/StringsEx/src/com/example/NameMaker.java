/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[]) {
        String firstName;
        String middleName;
        String lastName;
        String fullName;
        Scanner in = new Scanner(System.in);
        System.out.println("Input first name:");
        firstName = in.next();
        System.out.println("Input middle name:");
        middleName = in.next();
        System.out.println("Input last name:");
        lastName = in.next();
        fullName = firstName + " " + middleName + " " + lastName;
        System.out.println("Full name: " + fullName);
        fullName = "";
        fullName = fullName.concat(firstName);
        fullName = fullName.concat(" ");
        fullName = fullName.concat(middleName);
        fullName = fullName.concat(" ");
        fullName = fullName.concat(lastName);
        System.out.println("Full name: " + fullName);
    }
    
}
