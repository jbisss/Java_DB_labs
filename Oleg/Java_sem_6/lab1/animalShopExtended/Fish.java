package animalShopExtended;

public class Fish extends Animal{
    private String waterType;

    public Fish(String breed, String colour, String waterType) {
        super(breed, colour);
        this.waterType = waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public String getWaterType() {
        return waterType;
    }
}
