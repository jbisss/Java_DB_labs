package animalShop;

public class Dog {
    private String name;
    private String breed;
    private String barkNoise = "Woof";
    private double weight;
    public Dog(String name, String breed, double weight){
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }
    public Dog(String name, String breed, String noise, double weight){
        this.name = name;
        this.breed = breed;
        barkNoise = noise;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public double getWeight() {
        return weight;
    }

    public void bark(){
        System.out.println(this.barkNoise);
    }
    public void bark(String barkNoise){
        System.out.println(barkNoise);
    }
}
