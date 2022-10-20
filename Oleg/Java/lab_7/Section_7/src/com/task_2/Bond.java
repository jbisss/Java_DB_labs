package com.task_2;

public class Bond {
    public String name;
    public double balance, rate;
    public int term, monthRemaining;
    public void setTermAndRate (int t) {
        if (t >= 0 && t < 12) rate = 0.005;
        else if (t >= 12 && t < 24) rate = 0.01;
        else if (t >= 24 && t < 36) rate = 0.015;
        else if (t >= 36 && t < 48) rate = 0.02;
        else if (t >= 48 && t <= 60) rate = 0.025;
        else {
            System.out.println("Недопустимый срок");
            t = 0;
        }
        term = t;
        monthRemaining = t;
    }
    public void earnInterest() {
        if (monthRemaining > 0) {
            balance += balance*rate/12;
            monthRemaining--;
            System.out.println("Баланс: $" + this.balance);
            System.out.println("Ставка: " + this.rate);
            System.out.println("Остаток месяцев: " + this.monthRemaining);
        } else {
            System.out.println("Срок платежа облигации наступил");
        }
    }
}
