package inputVariables;

import java.util.Scanner;

public class InputVariables {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean boolVal;
        byte byteVal;
        char charVal;
        short shortVal;
        int intVal;
        long longVal;
        float floatVal;
        double doubleVal;

        System.out.println("Enter boolean: ");
        boolVal = in.nextBoolean();

        System.out.println("Enter byte: ");
        byteVal = in.nextByte();

        System.out.println("Enter char: ");
        charVal = in.next().charAt(0);

        System.out.println("Enter short: ");
        shortVal = in.nextShort();

        System.out.println("Enter int: ");
        intVal = in.nextInt();

        System.out.println("Enter long: ");
        longVal = in.nextLong();

        System.out.println("Enter float: ");
        floatVal = in.nextFloat();

        System.out.println("Enter double: ");
        doubleVal = in.nextDouble();
    }
}
