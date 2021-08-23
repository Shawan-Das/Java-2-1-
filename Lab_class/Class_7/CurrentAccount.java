package Lab_class.Class_7;

public class CurrentAccount extends BankAccount {
    public String tradeLicenseNumber;

    public CurrentAccount(String name, double balance, String license){
        super(name,balance,5000);
        this.tradeLicenseNumber=license;
    }

}
