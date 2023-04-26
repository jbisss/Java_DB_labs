package oraclProd.src.oraclProd;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String type;
        int quantity = 0;
        int statusNumber = 0;

        while (statusNumber != 4) {

            while (statusNumber != 2 || statusNumber != 4) {
                System.out.println("Press:" + " #1 ADD\n" + "#2 STAT\n " + "#3 ALL\n" + "#4 EXIT");
                statusNumber = sc.nextInt();
                switch (statusNumber) {

                    case 1:
                        System.out.println("Add (audio/video):");
                        type = sc.next();
                        System.out.println("How many items of the product?");

                        quantity = sc.nextInt();

                        for (int i = 0; i < quantity; i++)
                            if (type.equals("audio"))
                                products.add(new AudioPlayer("MP3/flac", "AppleProres"));
                            else if (type.equals("video"))
                                products.add(new MoviePlayer("Sony Video Player", MonitorType.LCD, new Screen("1920x1080", 40, 22)));
                            else {
                                System.out.println("Incorrect enter");
                                break;
                            }
                        break;


                    case 2:
                        statistic(products);
                        continue;
                    case 3:
                        print(products);
                        continue;
                    case 4:
                        break;
                }
                break;

            }
        }

        System.out.println("Exit from system ended correctly");
        sc.close();
    }

    public static void statistic(List<Product> products) {
        int countA = 0;
        int countM = 0;

        for (Product p : products)
            if (p instanceof AudioPlayer)
                countA++;
            else countM++;

        System.out.println("Total number of products: " + (countM + countA));
        System.out.println("Number of AudioPlayers: " + countA);
        System.out.println("Number of MoviePlayers: " + countM);
        System.out.println();

    }

    public static void print(List<Product> products) {

        for (Product p : products) {
            System.out.println(p);
            System.out.println();
        }
    }
}

