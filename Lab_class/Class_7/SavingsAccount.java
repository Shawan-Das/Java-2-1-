package Lab_class.Class_7;
public class SavingsAccount extends BankAccount{
    private double interest = 0.05, maxWithLimit;

    public SavingsAccount(String name, double balance, double limit){
        super(name,balance,2000);
        this.maxWithLimit=limit;
    }

    private double calculateInterest(){
        return interest*accountBalance;
    }

    double getNetBalance(){
        return accountBalance+calculateInterest();
    }
@Override
    void withdraw(double amt){
        if(amt<=maxWithLimit)
            super.withdraw(amt);
        else System.out.println("Withdraw Amount Not Acceptable");
    }

    public double getMaxLimit(){
        return maxWithLimit;
    }

    @Override
   public void display(){
        super.display();
        System.out.printf("Interest: %f; Max Withdraw Limit: %f\n",
                calculateInterest(),maxWithLimit);
    }

}
