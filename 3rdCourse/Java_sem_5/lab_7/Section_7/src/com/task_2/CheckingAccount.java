package com.task_2;

public class CheckingAccount {
    public String name;
    public double balance;
    public void withDraw (double changeBalance) {
        if (changeBalance < 0) {
            System.out.println("The sum to change is non-positive");
        } else if (changeBalance > this.balance) {
            System.out.println("The sum to change is bigger than a balance");
        } else {
            balance -=changeBalance;
        }
    }
}
