package com.examples;

class MyClass_4 {
    int number;
    char symbol;
    MyClass_4(){
        number=100;
        symbol='A';
    }
    MyClass_4(int n, char s){
        number=n;
        symbol=s;
    }
    void show(){
        System.out.println("Значения полей "+number+" и "+symbol);
    }
}
class UsingConstructorDemo{
    public static void main(String[] args){
        MyClass_4 objA=new MyClass_4();
        MyClass_4 objB=new MyClass_4(200,'B');
        System.out.println("Объект objA:");
        objA.show();
        System.out.println("Объект objB:");
        objB.show();
    }
}
