
package tip04;

import java.util.Objects;

public class Calculator {
    public double tax = .05;
    public double tip = .15;
    public int countPeople = 0;
    public double total = 0.0d;
    public double totalDop = 0;
    //Include the cost of Alex's and Forgetful's meals in your calculations
    //Return the total after calculating
    public void findTotal(double price, String name){
        countPeople++;
        if (countPeople == 6 || countPeople == 8) {
            totalDop += price*(1+tax+tip);
        }
        total += price*(1+tax+tip);
        System.out.println("For " + countPeople + " price with tax and tip:" + price*(1+tax+tip));
        if (countPeople == 8) {
            System.out.println("Total: $" + total);
            System.out.println("$" + totalDop / (countPeople - 2));
        }
    }
}
