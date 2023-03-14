package bikeproject.src.bikeproject;

import java.util.ArrayList;
import java.util.Random;

public class BikeList {
    public static void fillArray(ArrayList<Bike> bikes){
        Random rand = new Random();
        for(int i =0; i < 10;i++){
            if(rand.nextDouble()<0.75){
                bikes.add(new MountainBike());
            } else {
                bikes.add(new RoadBike());
            }
        }
    }
    public static void displayStock(ArrayList<Bike> bikes){
        for(Bike bike : bikes){
            bike.printDescription();
        }
    }
    public static int calculateStock(ArrayList<Bike> bikes){
        int bikesSold = 0;
        for(Bike bike:bikes){
            if(bike instanceof MountainBike){
                bikesSold++;
            }
        }
        return bikesSold;
    }
    public static void main(String[] args) {
        ArrayList<Bike> bikes = new ArrayList<>();
        fillArray(bikes);
        displayStock(bikes);
        int mountainBikeSales = calculateStock(bikes);
        int roadBikeSales = bikes.size() - mountainBikeSales;
        System.out.println("\nStock levels:");
        System.out.println("We have " + mountainBikeSales + " mountain bikes in stock!");
        System.out.println("We have " + roadBikeSales + " road bikes in stock!");
    }
}
