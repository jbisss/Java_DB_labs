package JavaBank.JavaBank.jar;

public abstract class AbstractBankAccount {
    public final String BANK = "JavaBank";
    public abstract void deposit(int amt);
    public abstract void withdraw(int amt);
    public abstract int getBalance();
    public abstract String getBankName();
}
