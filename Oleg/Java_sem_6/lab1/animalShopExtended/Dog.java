package animalShopExtended;

public class Dog extends NewSuper{
    private String name;
    private String barkNoise = "Woof";
    private double weight;

    public Dog(String breed, String colour, String name, String barkNoise, double weight) {
        super(breed, colour);
        this.name = name;
        this.barkNoise = barkNoise;
        this.weight = weight;
    }

    public Dog(String breed, String colour, String name, double weight) {
        super(breed, colour);
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
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
