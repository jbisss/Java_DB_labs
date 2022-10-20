package com.task_1;

import java.util.Scanner;

public class PinCode {
    public static void main(String[] args) {
        String pinCode = "1234";
        String pinCodeToEnter = "";
        boolean flag = false;
        Scanner in = new Scanner(System.in);
        while (!flag) {
            System.out.println("Enter a pin-code:");
            pinCodeToEnter = in.next();
            if(pinCodeToEnter.equals(pinCode)) {
                flag = true;
                System.out.println("You are allowed to your bank account!");
            }
        }
    }
}
