
package com.example;

public class Countdown {

    public static void main(String[] args) {
        int i;
        System.out.println("Countdown to Launch: ");
        for(i = 5; i >= 0; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Blast Off!");
        System.out.println("The value of i after the for loop " + i);
    }
}
