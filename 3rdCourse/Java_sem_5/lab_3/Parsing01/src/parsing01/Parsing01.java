package parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice = "30", taxRate="0.7", gibberish="1234abcd";
        //Parse shirtPrice and taxRate, and print the total tax
        System.out.println(Integer.parseInt(shirtPrice)*Double.parseDouble(taxRate));
        //Try to parse taxRate as an int
        int taxRateInt=Integer.parseInt(taxRate);
        //Try to parse gibberish as an int
        int gibberishInt=Integer.parseInt(gibberish);
    }
}
