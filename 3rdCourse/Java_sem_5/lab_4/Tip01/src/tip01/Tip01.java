package tip01;

public class Tip01 {
    public static void main(String[] args) {
        //Find everyone's individual total after tax(5%) and tip(15%)
        /*This is what everyone owes before tax and tip:
        Person 1: $10
        Person 2: $12
        Person 3: $9
        Person 4: $8
        Person 5: $7
        Person 6: $15
        Person 7: $11
        Person 8: $30
        */
        System.out.println(10 + (float) 10 * 0.05 + (float) 10 * 0.15);
        System.out.println(12 + (float) 12 * 0.05 + (float) 12 * 0.15);
        System.out.println(9 + (float) 9 * 0.05 + (float) 9 * 0.15);
        System.out.println(8 + (float) 8 * 0.05 + (float) 8 * 0.15);
        System.out.println(7 + (float) 7 * 0.05 + (float) 7 * 0.15);
        System.out.println(15 + (float) 15 * 0.05 + (float) 15 * 0.15);
        System.out.println(11 + (float) 11 * 0.05 + (float) 11 * 0.15);
        System.out.println(30 + (float) 30 * 0.05 + (float) 30 * 0.15);
    }    
}
