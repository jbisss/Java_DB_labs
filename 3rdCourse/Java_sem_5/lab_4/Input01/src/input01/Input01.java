package input01;

import javax.swing.*;

public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPane.
        //Store the input as a String and print it.
        String input = JOptionPane.showInputDialog("Input here:");
        System.out.println(input);
        //Parse the input as an int.
        //Print its value +1
        int toInt = Integer.parseInt(input);
        System.out.println(toInt + 1);
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        //You should have only one semicolon (;) in this line.
        int anotherToInt = Integer.parseInt(JOptionPane.showInputDialog("Another input:"));
    }
}
