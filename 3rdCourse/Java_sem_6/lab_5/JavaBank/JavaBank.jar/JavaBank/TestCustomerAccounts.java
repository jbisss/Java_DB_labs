package JavaBank;

public class TestCustomerAccounts {
    public static void main(String[] args){
        AbstractBankAccount[] bankAccount = new AbstractBankAccount[5];

        bankAccount[0] = new Account("Sujjey Gupta", 11556,300,AccountType.SAVINGS);
        bankAccount[1] = new Account("He Xai", 22338,500,AccountType.SAVINGS);
        bankAccount[2]=new Account("Ilya Mustafana", 44559,1000,AccountType.SAVINGS);

        bankAccount[3]=new CreditAccount("A.N Other", 88776, 500);
        bankAccount[4]=new CreditAccount("Another", 66768, 1000,500);

        for(AccountType act:AccountType.values()){
            System.out.println("Value: "+ act.name()+
                    ", position "+ act.ordinal());
        }
        //showAllCustomerAccounts(bankAccount);
    }

    public static void showAllCustomerAccounts(AbstractBankAccount[] bankAccount){
        System.out.println("\nAll customer accounts: *****");
        for(AbstractBankAccount act:bankAccount){
            System.out.println(act);
        }
    }

    public void showAllAccounts(AbstractBankAccount[] bankAccount){
        System.out.println("\n All Account Types: *****");
        for(AbstractBankAccount act:bankAccount){
            if(act instanceof Account){
                System.out.println(act);
            }
        }
    }

    public void showAllCreditAccounts(AbstractBankAccount[] bankAccount){
        System.out.println("\n All CreditAccount Types: *****");
        for(AbstractBankAccount act:bankAccount){
            if(act instanceof CreditAccount){
                System.out.println(act);
            }
        }
    }
}
