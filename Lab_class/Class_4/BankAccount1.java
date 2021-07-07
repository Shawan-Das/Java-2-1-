package Lab_class.Class_4;

import java.util.ArrayList;

public class BankAccount1 {
    public String name; String id; double balance;
    BankAccount1(String name, String id, double balance){
        this.name=name;
        this.id=id;
        this.balance=balance;
    }

    void deposit(double depAmount){
        balance=balance+depAmount;
    }

    void withdraw(double withAmount){
        if(balance>withAmount)
            balance=balance-withAmount;

        else System.out.println("Low Balance");
    }

    double getBalance(){
        return balance;
    }

    public String toString(){
        return "BankAccount [User Name:" + name + ", ID:"+ id + ",Balance=" + balance + "]";
    }
}




