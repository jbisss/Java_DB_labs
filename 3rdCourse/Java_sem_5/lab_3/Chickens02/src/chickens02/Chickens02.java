
package chickens02;

public class Chickens02 {
    public static void main(String[] args) {
        //Put your code here
        int countDays = 0;
        int countEggs = 0;
        // monday
        countDays++;
        countEggs+=100;
        // tuesday
        countDays++;
        countEggs+=121;
        // wednesday
        countDays++;
        countEggs+=117;
        double dailyAverage = (double)(countEggs) / (double)(countDays);
        double monthlyAverage = dailyAverage * 30;
        double monthlyProfit = monthlyAverage * 0.18;
        System.out.println("Daily Average:   " + dailyAverage);
        System.out.println("Monthly Average: " + monthlyAverage);
        System.out.println("Monthly Profit:  $" + monthlyProfit);
    }
    
}
