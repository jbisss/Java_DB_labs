package com.examples;

import javax.swing.JOptionPane;
class MyClass_2 {
    int number;
    char symbol;
    void set(int n,char s){
        number=n;
        symbol=s;
    }
    String getInfo(){

        String text="Number: "+number+"\n";
        text+="Symbol: "+symbol;
        return text;
    }
}
class UsingObjectWithMethodsDemo{
    public static void main(String[] args){
        MyClass_2 objA=new MyClass_2();
        MyClass_2 objB=new MyClass_2();
        objA.set(100,'A');
        objB.set(200,'B');
        JOptionPane.showMessageDialog(null,
                objA.getInfo(),
                "First object",
                JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,
                objB.getInfo(),
                "Second object",
                JOptionPane.INFORMATION_MESSAGE);
    }
}
