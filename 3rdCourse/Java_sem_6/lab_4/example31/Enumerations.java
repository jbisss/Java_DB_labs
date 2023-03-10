package example31;

enum AccountType{
    CURRENT("CU", 1.0),
    SAVINGS("SAVE", 2.0),
    CREDIT("CRE", 3.0);
    private final String code;
    private final double rate;
    private AccountType(String code, double rate){
        this.code = code;
        this.rate = rate;
    }
    public String getCode(){
        return this.code;
    }
    public double getRate(){
        return this.rate;
    }
}

class Account{
    private AccountType type;
    public Account(AccountType type){
        this.type = type;
    }
    @Override
    public String toString(){
        return "Account type " + this.type;
    }
}

public class Enumerations {
    public static void main(String[] args) {
        Account account_1 = new Account(AccountType.SAVINGS);
        Account account_2 = new Account(AccountType.CREDIT);
        System.out.println(account_1);
        System.out.println(account_2);
        AccountType a_1 = AccountType.CREDIT;
        // AccountType a_2 = AccountType.SAVINGS;
        System.out.println(a_1.getCode() + " " + a_1.getRate());
    }
}
