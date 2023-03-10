package com.examples;

import javax.swing.JOptionPane;
class MyClass_1 {
    int number;
    char symbol;
}
class UsingObjectDemo{
    public static void main(String[] args){
        MyClass_1 obj = new MyClass_1();
        obj.number = 100;
        obj.symbol = 'A';
        String text = "Number: "+obj.number+"\n";
        text += "Symbol: "+obj.symbol;
        JOptionPane.showMessageDialog(null,text);
    }
}
