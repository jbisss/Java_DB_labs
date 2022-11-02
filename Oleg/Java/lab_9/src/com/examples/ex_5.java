package com.examples;

class MyClass_5 {
    static int count=0;
    MyClass_5(){
        count++;
        System.out.println("Саздан объект номер "+count);
    }
    static void show(){
        System.out.println("Количество объектов "+count);
    }
}

class UsingStaticMembersDemo{
    public static void main(String[] args){
        MyClass_5.show();
        MyClass_5 objA=new MyClass_5();
        MyClass_5 objB=new MyClass_5();
        MyClass_5 objC=new MyClass_5();
        MyClass_5.show();
        objC.show();
        objB.show();
    }
}
