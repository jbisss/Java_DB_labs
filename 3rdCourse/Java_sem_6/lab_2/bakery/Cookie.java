package bakery;

public class Cookie implements Item{
    private String cookieType;
    private double price;

    public Cookie(String cookieType, double price) {
        this.cookieType = cookieType;
        this.price = price;
    }

    @Override
    public String getItemName() {
        return this.cookieType;
    }

    @Override
    public double setPrice() {
        return this.price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDepartment() {
        return "Bakery";
    }
}
