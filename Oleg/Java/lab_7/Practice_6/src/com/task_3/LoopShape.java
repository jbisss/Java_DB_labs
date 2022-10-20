package com.task_3;

public class LoopShape {
    public void createRectangle(int l, int h){
        if (l < 1 || h < 1) {
            System.out.println("Incorrect input value!");
        } else {
            for (int i = 0; i < h; i++){
                for (int j = 0; j < l; j++){
                    if (i == 0 || i == h - 1){
                        System.out.print("*");
                    }
                    else {
                        if (j == 0 || j == l - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }

                    }
                }
                System.out.println();
            }
        }
    }
    public void createTriangle(int h){
        if (h < 1) {
            System.out.println("Incorrect input value!");
        } else {
            int side = h - 1;
            for (int i = 0; i < h; i++){
                for (int j = 0; j < h - side; j++){
                    if (i == 0 || i == h - 1){
                        System.out.print("*");
                    }
                    else {
                        if (j == 0 || j == h - side - 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }

                    }
                }
                System.out.println();
                side--;
            }
        }
    }
}
