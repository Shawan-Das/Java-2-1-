package Lab_class.Class_7;

import java.util.Random;

public class BankAccount {
    private String memberName; String accountNumber; double accountBalance, minimumBalance;

    public BankAccount(String name, double balance, double minBalance){
        this.memberName=name;
        this.accountBalance=balance;
        this.minimumBalance=minBalance;
        Random rand = new Random();
        String num;
        num = "" + rand.nextInt(10) + rand.nextInt(10)+ rand.nextInt(10)+
                rand.nextInt(10)+ rand.nextInt(10);
        accountNumber = num;
    }

    public String getMemberName(){
        return memberName;
    }
    public String getAccountNumber(){
        return accountNumber;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public double getMinimumBalance(){
        return minimumBalance;
    }

    public void setMemberName(String name){
        this.memberName= name;
    }
    public void setMinimumBalance(double minBalance){
        this.minimumBalance = minBalance;
    }


    void deposit(double depAmount){
        accountBalance+=depAmount;
    }

    void withdraw(double withAmount) {
        if (accountBalance - withAmount > minimumBalance){
            accountBalance = accountBalance - withAmount;
    }
        else{ System.out.println("Low Balance");}
    }

    double getBalance(){
       return accountBalance;
    }

    public void display(){
        System.out.printf("Name : %s; Account Number: %s; Balance:%f ",memberName,accountNumber,accountBalance);
    }
}


