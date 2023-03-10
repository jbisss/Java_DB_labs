
package shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
        String custName = "Alex";
        String itemDesc = "Shirts";
        String message = custName+" wants to purchase a "+itemDesc;
        // Declare and initialize numeric fields: price, tax, quantity.   
        double price = 800;
        double tax = 150;
        int quantity = 4;
        // Declare and assign a calculated totalPrice
        double totalPrice = (price+tax)*quantity;
        // Modify message to include quantity 
        message += " in amount of " + quantity + " price of " + price;
        System.out.println(message);
        // Print another message with the total cost
        String messageTotalPrice = "Total price: " + totalPrice;
        System.out.println(messageTotalPrice);
    }    
}
