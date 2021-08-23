package Lab_class.Class_7;
import java.util.ArrayList;
public class Bank {
    ArrayList<BankAccount> accounts = new ArrayList<>();

    private void addAccount(BankAccount acc){
        accounts.add(acc);
        System.out.printf("Account Number: %s\n",acc.getAccountNumber());
    }

    public void addAccount(String name,double balance, double maxWithLimit){
        BankAccount accounts= new SavingsAccount(name,balance,maxWithLimit);
        addAccount(accounts);
    }

    public void addAccount(String name,double balance,String tradeLicense){
        BankAccount accounts= new CurrentAccount(name,balance,tradeLicense);
        addAccount(accounts);
    }

    private BankAccount findAccount(String accountNumber){
        for(int i=0;i<accounts.size();i++){
            if(accounts.get(i).getAccountNumber().equals(accountNumber))
                return accounts.get(i);
        }
        return null;
    }

    void deposit(String accountNumber,double amt){
        BankAccount bnk = findAccount(accountNumber);
        if(bnk == null) System.out.println("Account Doesn't Exist");
        else bnk.deposit(amt);
    }

    void withdraw(String accountNumber,double amt){
        BankAccount bnk = findAccount(accountNumber);
        if(bnk == null) System.out.println("Account Doesn't Exist");
        else bnk.withdraw(amt);
    }

   public void getBalance(String accountNumber){
        BankAccount bnk = findAccount(accountNumber);
        if(bnk == null) System.out.println("Account Doesn't Exist");
       else if(bnk instanceof CurrentAccount)
            System.out.printf("Balance: %f\n",bnk.getBalance());

        else System.out.printf("Balance: %f\n",((SavingsAccount)bnk).getNetBalance());

    }

    public void display(String id){
        BankAccount bnk  = findAccount(id);
        if(bnk == null) System.out.println("Account Doesn't Exist");
        else bnk.display();
    }

    void display() {
        for (int i = 0; i < accounts.size(); i++) {
            accounts.get(i).display();
        }
    }
}
