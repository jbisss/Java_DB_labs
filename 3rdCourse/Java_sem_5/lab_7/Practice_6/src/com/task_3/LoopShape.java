package com.task_3;

public class LoopShape {
    public String createRectangle(int l, int h){
        String output= "";
        if (l < 1 || h < 1) {
            System.out.println("Incorrect input value!");
        } else {
            for (int i = 0; i < h; i++){
                for (int j = 0; j < l; j++){
                    if (i == 0 || i == h - 1){
                        // System.out.print("*");
                        output+="*";
                    }
                    else {
                        if (j == 0 || j == l - 1) {
                            // System.out.print("*");
                            output+="*";
                        } else {
                            // System.out.print(" ");
                            output+=" ";
                        }

                    }
                }
                // System.out.println();
                output+="\n";
            }
        }
        return output;
    }
    public String createTriangle(int h){
        String output = "";
        if (h < 1) {
            System.out.println("Incorrect input value!");
        } else {
            int side = h - 1;
            for (int i = 0; i < h; i++){
                for (int j = 0; j < h - side; j++){
                    if (i == 0 || i == h - 1){
                        output+="*";
                        // System.out.print("*");
                    }
                    else {
                        if (j == 0 || j == h - side - 1) {
                            // System.out.print("*");
                            output+="*";
                        } else {
                            // System.out.print(" ");
                            output+=" ";
                        }

                    }
                }
                // System.out.println();
                output+="\n";
                side--;
            }
        }
        return output;
    }
}
