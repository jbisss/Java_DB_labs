
package chickens01;

public class Chickens01 {
    public static void main(String[] args) {
        // Put your code here
        int totalEggs= 0;
        int eggsPerChicken = 4;
        int chickenCount = 8;
        // monday
        totalEggs+=eggsPerChicken*chickenCount;
        // tuesday
        chickenCount++;
        totalEggs+=eggsPerChicken*chickenCount;
        // wednesday
        chickenCount/=2;
        totalEggs+=eggsPerChicken*chickenCount;
        System.out.println(totalEggs);
    }   
}
