package oraclProd.src.oraclProd;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestProductionLine {
	public static void main(String[] args) {
		// создаем список плееров
				List<Product> products = new ArrayList<>( Arrays.asList(
						new MoviePlayer("VLC"),
						new MoviePlayer("Panasonic"),
						new AudioPlayer("CD", "Samsung")));
				Collections.sort(products); // сортируем список
				
				
				
				EmployeeInfo e1 = new EmployeeInfo();
				//System.out.println(e1);
				ProcessFiles process1 = new ProcessFiles();
				try {
					process1.WriteFile(products);
					process1.WriteFile(e1.toString());
				} catch(IOException e) {
					System.out.println(e);
				}				
			}
			
			public static void print(List<Product> products) {

		        for (Product p : products) {
		            System.out.println(p);
		            System.out.println();
		        }
		    }
			
			public static String reverseString(String id) {

				if(id.length() == 1)
					return id;
				else {
					String text = id.substring(0, id.length()-1);
					return id.charAt(id.length()-1) + reverseString(text);
				}
	}
}
