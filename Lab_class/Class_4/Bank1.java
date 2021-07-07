package Lab_class.Class_4;

import java.util.ArrayList;
public class Bank1 {
    String name;
    ArrayList<BankAccount1> accounts = new ArrayList<>();
    public Bank1(String name){
        this.name =name;
    }

    void createAccount(String name, String id, double amt){
        BankAccount1 bnk = new BankAccount1(name,id,amt);
        accounts.add(bnk);
    }

    BankAccount1 findAccount(String id){
        for(int i=0; i<accounts.size();i++){
            if(accounts.get(i).id.equals(id)) return accounts.get(i);
        }
        return null;
    }

    void deposit(String id, double amt){
        BankAccount1 bnk = findAccount(id);
        if(bnk == null) System.out.println("Account Doesn't Exist");
        else bnk.deposit(amt);
    }

    void withdraw(String id, double amt){
        BankAccount1 bnk = findAccount(id);
        if(bnk==null) System.out.println("Account Doesn't Exist");
        else bnk.withdraw(amt);
    }

    public void display(String id){
        BankAccount1 bnk  = findAccount(id);
        if(bnk == null) System.out.println("Account Doesn't Exist");
        else System.out.println(bnk);
    }

    void display(){
        for(int i=0;i<accounts.size();i++){
            System.out.println(accounts.get(i));
        }
    }
}