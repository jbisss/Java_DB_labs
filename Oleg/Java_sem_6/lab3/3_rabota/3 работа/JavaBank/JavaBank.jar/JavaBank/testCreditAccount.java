package JavaBank;

public class testCreditAccount {
	public static void main(String[] args) {
        Account a1 = new Account("Sujjey Gupta", 11556,300);
        Account a2 = new Account("He Xai", 22338,500);
        Account a3=new Account("Ilya Mustafana", 44559,1000);

        CreditAccount c1 = new CreditAccount("A.N Other", 88776, 500);
        CreditAccount c2 = new CreditAccount("Another", 66768, 1000,500);

            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);

            System.out.println(c1);
            System.out.println(c2);
    }
}

