package oraclProd.src.oraclProd;
//step 3
import java.util.Date;

public abstract class Product implements Item,Comparable<Product> {
	//step 14
	@Override
	public int compareTo(Product prod) {
		return name.compareTo(prod.getName());
	}
	
	private int serialNumber; 
	private String manufacturer=Item.manufacturer; 
	private Date manufacturedOn; 
	private String name;
public static int currentProductionNumber = 0;
	
	public void setProductionNumber(int productionNumber) {
		this.serialNumber=productionNumber;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Date getManufactureDate() {
		return this.manufacturedOn;
	}
	
	 public int getSerialNumber() {
		 return serialNumber;
	 }
	 

	 public Product(String name) {
		 this.name=name;
		 serialNumber = currentProductionNumber;
		 currentProductionNumber++;
		 manufacturedOn = new Date(System.currentTimeMillis());
	 }
	 
	 @Override
	  public String toString() {
	    return
	        "\n" +
	            "Manufacturer : " + manufacturer + "\n" +
	            "Serial Number : " + serialNumber + "\n" +
	            "Date : " + manufacturedOn + "\n" +
	            "Name : " + name;
	  }
}
