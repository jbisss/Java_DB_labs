package JavaBank;

import JavaBankOld.Account;
import JavaBankOld.CreditAccount;

public class testCreditAccount {
	public static void main(String[] args) {
        JavaBankOld.Account a1 = new JavaBankOld.Account("Sujjey Gupta", 11556,300);
        JavaBankOld.Account a2 = new JavaBankOld.Account("He Xai", 22338,500);
        JavaBankOld.Account a3=new Account("Ilya Mustafana", 44559,1000);

        JavaBankOld.CreditAccount c1 = new JavaBankOld.CreditAccount("A.N Other", 88776, 500);
        JavaBankOld.CreditAccount c2 = new CreditAccount("Another", 66768, 1000,500);

            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);

            System.out.println(c1);
            System.out.println(c2);
    }
}

