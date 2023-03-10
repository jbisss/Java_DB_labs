package animalShopExtended;

public class Animal {
    private String breed;
    private String colour;

    public Animal(String breed, String colour) {
        this.breed = breed;
        this.colour = colour;
    }

    public String getBreed() {
        return breed;
    }

    public String getColour() {
        return colour;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
