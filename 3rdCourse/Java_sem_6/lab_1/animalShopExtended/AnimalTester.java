package animalShopExtended;

import java.nio.channels.Pipe;
import java.util.SortedMap;

public class AnimalTester {
    public static void main(String[] args) {
        Dog dog = new Dog("Boerboel", "brown", "Bailey", "arf-arf", 80.2);
        Fish fish = new Fish("Goldfish", "red", "cold");
        System.out.println("Dog name: " + dog.getName());
        System.out.println("Dog breed: " + dog.getBreed());
        System.out.println("Bark noise: ");
        dog.bark();
        System.out.println("Dog weight: " + dog.getWeight());
        System.out.println("Dog colour: " + dog.getColour());

        System.out.println("Fish breed: " + fish.getBreed());
        System.out.println("Water type: " + fish.getWaterType());
        System.out.println("Fish colour: " + fish.getColour());

        int a = 8 & 16;
        System.out.println(a);
    }
}
