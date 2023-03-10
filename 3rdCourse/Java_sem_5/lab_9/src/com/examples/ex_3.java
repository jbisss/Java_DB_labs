package com.examples;

class MyClass_3 {
    int number;
    char symbol;
    void set(int n){
        number=n;
    }
    void set(char s){
        symbol=s;
    }
    void set(int n,char s){
        set(n);
        set(s);
    }
    void set(){
        set(0,'Z');
    }
    void show(){
        System.out.println("Значения полей "+number+" и "+symbol);
    }
    void show(String txt){
        System.out.println(txt+": значения полей "+number+" и "+symbol);
    }
    void show(String txt1,String txt2){
        System.out.println(txt1+": "+number);
        System.out.println(txt2+": "+symbol);
    }
}
class MethodOverloadingDemo{
    public static void main(String[] args){
        MyClass_3 objA,objB;
        objA=new MyClass_3();
        objB=new MyClass_3();
        objA.set(100);
        objA.set('A');
        System.out.println("Объект objA:");
        objA.show();
        objB.set();
        objB.show("Объект objB");
        objB.set(200,'B');
        System.out.println("Объект objB после изменения:");
        objB.show("Число","Символ");
    }
}
