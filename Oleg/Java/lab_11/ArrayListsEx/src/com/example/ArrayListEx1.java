/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.ArrayList;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Amy");
        al.add("Bob");
        al.add("Cindy");
        al.add("David");
        System.out.println(al + " the size of an array is: " + al.size());
        String temp = al.get(1);
        al.set(1, al.get(3));
        al.set(3, temp);
        System.out.println(al + " the size of an array is: " + al.size());
        al.add(0, "Nick");
        al.add(1,"Mike");
        al.remove(3);
        System.out.println(al + " the size of an array is: " + al.size());
    }
    
}
