package com.example;

import java.util.Scanner;

public class Divisors {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in); // забираем поток ввода
        System.out.print("Enter the number :  "); // запрашиваем ввод числа
        int num = console.nextInt(); // вводим число
        System.out.print("Divisors of " + num+" "+ "="+" " ); // выводим число, делители которого собираемся найти
        for (int i = 1; i <= num; i++) { // цикл проходит от единицы до числа
            if (num % i != 0) { // если исходное число не делится на очередное, то идём дальше
                continue; // переходим к следующей итерации
            }
            System.out.print(i + " , "); // выводим подходящие числа
        }
    }
}
