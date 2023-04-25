package oraclProd.src.oraclProd;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Product> products;
		products=testCollection();
		Collections.sort(products);
		print(products);
	}
	
	//step 15
	public static ArrayList<Product> testCollection() {

	    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
	    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV ");
	    MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
	        MonitorType.LCD, new Screen(" 720x480", 40, 22));
	    MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK", MonitorType.LED,new Screen("1366x768", 40, 22));

	    ArrayList<Product> products = new ArrayList<>();

	    products.add(a1);
	    products.add(a2);
	    products.add(m1);
	    products.add(m2);
	    return products;
	  }
	//step 16
	public static void print(ArrayList<Product> list) {
		for(Product prod:list) {
			System.out.print(prod+" ");
			System.out.println();
		}
	}
}
