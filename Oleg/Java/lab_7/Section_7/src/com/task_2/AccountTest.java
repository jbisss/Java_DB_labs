package com.task_2;

public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount account = new CheckingAccount();
        account.name = "Billy";
        account.balance = 300;
        account.withDraw(123.45);
        Bond bond = new Bond();
        bond.balance = 100;
        bond.setTermAndRate(11);
        bond.earnInterest();
        bond.earnInterest();
    }
}
