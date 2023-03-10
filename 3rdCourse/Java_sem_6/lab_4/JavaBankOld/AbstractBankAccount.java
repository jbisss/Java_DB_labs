package JavaBankOld;

public abstract class AbstractBankAccount {
    public final String BANK = "JavaBank";


    protected String accountName;
    protected int accountNum;
    protected int balance;

    public AbstractBankAccount(String name, int num,int amt)
    {
        accountName =name;
        accountNum =num;
        balance=amt;
    }

    @Override
    public String toString(){
        return "\n\nBank name 	: "+getBankName()+
                "\nAccount Holder : "+accountName+
                "\nAccount Number : "+accountNum+
                "\nAccount Balance : "+balance;
    }

    public abstract void deposit(int amt);
    public void withdraw(int amt){
        balance=balance-amt;
    }
    public String getBankName(){
        return BANK;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

}
