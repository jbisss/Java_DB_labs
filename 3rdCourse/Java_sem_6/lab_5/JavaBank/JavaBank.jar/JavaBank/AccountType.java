package JavaBank.JavaBank.jar.JavaBank;

public enum AccountType {
    CURRENT("CU",1.0),
    SAVINGS("SA",2.0),
    CREDIT("CR",0.0);

    private String code;
    private double rate;

    AccountType(String code, double rate) {
        this.code=code;
        this.rate=rate;
    }

    public String getCode(){
        return code;
    }

    public double getRate() {
        return rate;
    }
}
