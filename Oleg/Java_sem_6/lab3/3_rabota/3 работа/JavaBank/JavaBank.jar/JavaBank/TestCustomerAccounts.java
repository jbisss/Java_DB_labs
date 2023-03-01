package JavaBank;

import JavaBankOld.AbstractBankAccount;
import JavaBankOld.Account;
import JavaBankOld.CreditAccount;

public class TestCustomerAccounts {
    public static void main(String[] args){
        JavaBankOld.AbstractBankAccount[] bankAccount = new JavaBankOld.AbstractBankAccount[5];



        bankAccount[0] = new JavaBankOld.Account("Sujjey Gupta", 11556,300);
        bankAccount[1] = new JavaBankOld.Account("He Xai", 22338,500);
        bankAccount[2]=new JavaBankOld.Account("Ilya Mustafana", 44559,1000);

        bankAccount[3]=new JavaBankOld.CreditAccount("A.N Other", 88776, 500);
        bankAccount[4]=new JavaBankOld.CreditAccount("Another", 66768, 1000,500);

        showAllCustomerAccounts(bankAccount);
        showAllCreditAccounts(bankAccount);
    }

    public static void showAllCustomerAccounts(JavaBankOld.AbstractBankAccount[] bankAccount){
        System.out.println("\nAll customer accounts: *****");
        for(JavaBankOld.AbstractBankAccount act:bankAccount){
            System.out.println(act);
        }
    }

    public static void showAllAccounts(JavaBankOld.AbstractBankAccount[] bankAccount){
        System.out.println("\n All Account Types FFFFFFFFFFFF: *****");
        for(JavaBankOld.AbstractBankAccount act:bankAccount){
            if(act instanceof JavaBankOld.Account){
                System.out.println(act);
            }
        }
    }

    public static void showAllCreditAccounts(JavaBankOld.AbstractBankAccount[] bankAccount){
        System.out.println("\n All CreditAccount Types GGGGGGGGGGG: *****");
        for(AbstractBankAccount act:bankAccount){

            if(act instanceof CreditAccount){
                System.out.println(act);
            }
            if (act instanceof Account){
                System.out.println("ACCOUNT"+act);
            }
        }
    }
}
