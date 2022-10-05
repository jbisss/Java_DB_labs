import java.util.Random;
import java.util.Scanner;

public class practice {
    public static double fahrenheitToCelsius (double degrees) {
        return (double)5/9*(degrees-32);
    }
    public static double countHypotenuse (double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
    public static int roll(){
        Random rand = new Random();
        int firstDice = rand.nextInt(6) + 1;
        int secondDice = rand.nextInt(6) + 1;
        return firstDice + secondDice;
    }
    public static void processName(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        String[] firstAndLastName = name.split(" ");
        System.out.print(firstAndLastName[1] + " " + firstAndLastName[0].charAt(0) + ".");
    }
    public static void main(String[] args) {
        System.out.println(fahrenheitToCelsius(100));
        System.out.println(countHypotenuse(3.0d, 4.0d));
        // rolling dices
        System.out.println(roll());
        processName();
    }
}


