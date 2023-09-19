package JavaBank;

public class TestCustomerAccounts {
    public static void main(String[] args){
        AbstractBankAccount[] bankAccount = new AbstractBankAccount[5];



        bankAccount[0] = new Account("Sujjey Gupta", 11556,300);
        bankAccount[1] = new  Account("He Xai", 22338,500);
        bankAccount[2]=new  Account("Ilya Mustafana", 44559,1000);

        bankAccount[3]=new  CreditAccount("A.N Other", 88776, 500);
        bankAccount[4]=new  CreditAccount("Another", 66768, 1000,500);

        showAllCustomerAccounts(bankAccount);
        showAllCreditAccounts(bankAccount);
    }

    public static void showAllCustomerAccounts( AbstractBankAccount[] bankAccount){
        System.out.println("\nAll customer accounts: *****");
        for( AbstractBankAccount act:bankAccount){
            System.out.println(act);
        }
    }

    public static void showAllAccounts( AbstractBankAccount[] bankAccount){
        System.out.println("\n All Account Types FFFFFFFFFFFF: *****");
        for( AbstractBankAccount act:bankAccount){
            if(act instanceof  Account){
                System.out.println(act);
            }
        }
    }

    public static void showAllCreditAccounts( AbstractBankAccount[] bankAccount){
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
