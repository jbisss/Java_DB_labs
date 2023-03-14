package dopTastTo3_1;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> countries = new HashSet<>();
        countries.add("Russia");
        countries.add("USA");
        countries.add("Japan");
        countries.add("France");
        countries.add("Germany");
        countries.add("Russia");
        System.out.println("HashSet: ");
        System.out.println(countries);
    }
}
