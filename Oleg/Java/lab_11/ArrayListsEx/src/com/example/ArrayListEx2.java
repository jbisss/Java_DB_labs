/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class ArrayListEx2 {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(5);
        Iterator<Integer> i = al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        i = al.iterator();
        while(i.hasNext()){
            if(i.next() % 2 == 0){
                i.remove();
            }
        }
        System.out.println();
        i = al.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
