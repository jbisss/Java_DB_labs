package JavaBank.JavaBank.jar.JavaBank;

public class testBank {
	public static void main(String[] args) {
		Account a1 = new Account("Sujjey Gupta", 11556,300,AccountType.SAVINGS);
		Account a2 = new Account("He Xai", 22338,500,AccountType.SAVINGS);
		Account a3=new Account("Ilya Mustafana", 44559,1000,AccountType.SAVINGS);

		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);

	}
}
