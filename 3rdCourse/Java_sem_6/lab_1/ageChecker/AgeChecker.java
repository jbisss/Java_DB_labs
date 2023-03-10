package ageChecker;

import java.util.Scanner;

public class AgeChecker {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        char holdCarLicence;

        System.out.println("Enter your age: ");
        age = in.nextInt();
        System.out.println("Do you hold driving licence");
        holdCarLicence = in.next().charAt(0);

        if(age > 20 && holdCarLicence == 'y') {
            System.out.println("You are adult and can drive car");
        } else {
            System.out.println("You are not adult and can't drive car");
        }

        in.close();
    }
}
