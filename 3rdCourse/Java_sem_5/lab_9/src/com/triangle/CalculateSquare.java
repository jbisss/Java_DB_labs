package com.triangle;

public class CalculateSquare {
    public double calculate(int a, int b){
        System.out.println("Rectangle");
        return a * b;
    }
    public double calculate(int a){
        System.out.println("Triangle");
        return (Math.sqrt(3)/4)*Math.pow(a, 2);
    }
}
