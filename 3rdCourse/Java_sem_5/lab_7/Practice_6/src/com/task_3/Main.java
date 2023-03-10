package com.task_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        LoopShape lp = new LoopShape();
        String rectangle = lp.createRectangle(6,3);
        // System.out.println("\n" + rectangle);
        System.out.println();
        String triangle = lp.createTriangle(9);
        // System.out.println("\n" + triangle);
        Random r = new Random();
        for(int i = 0; i < 5; i++){
            int y = r.nextInt(10) + 1;
            if(y % 2 == 0){
                System.out.println(lp.createRectangle(y,y));
            } else {
                System.out.println(lp.createTriangle(y));
            }
        }
    }
}
