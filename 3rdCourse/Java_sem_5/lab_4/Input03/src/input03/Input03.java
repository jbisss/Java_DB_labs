package input03;

import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner in = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
        System.out.println("Sum:" + (x1 + x2 + x3));
        //Remember to close the Scanner
        in.close();
    }
}
