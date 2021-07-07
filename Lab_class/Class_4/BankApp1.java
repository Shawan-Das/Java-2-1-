package Lab_class.Class_4;

import java.util.Scanner;

public class BankApp1 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.printf("Enter Bank Name: "); String bname=scan.nextLine();
        Bank1 bnk= new Bank1(bname);
        System.out.printf("For Exit Enter               : 0 \n");
        System.out.printf("For New Account Enter        : 1 \n");
        System.out.printf("For Deposit Enter            : 2 \n");
        System.out.printf("For Withdraw Enter           : 3 \n");
        System.out.printf("For Display Details Enter    : 4 \n");
        System.out.printf("For Display all account enter: 5 \n");
        while(true)
        {
            System.out.printf("Enter Option: ");
            int ch= scan.nextInt();
            scan.nextLine();
            if(ch==0) break;

            if(ch==1) {
                System.out.printf("Create your Account\n");
                System.out.printf("Enter Your Name: ");
                String name= scan.nextLine();
                System.out.printf("Enter Your ID: ");
                String id=scan.nextLine();
                System.out.printf("Enter Your Balance: ");
                double balance=scan.nextDouble();
                bnk.createAccount(name,id,balance);
            } // 2nd case

            if(ch==2) {
                System.out.printf("Enter Your Id: ");
                String id=scan.nextLine();
                System.out.printf("Enter Deposit Amount: ");
                double amt= scan.nextDouble();
                bnk.deposit(id,amt);
            }//3d case.

            if(ch==3) {
                System.out.printf("Enter Your Id: ");
                String id=scan.nextLine();
                System.out.printf("Enter Withdraw Amount: ");
                double amt= scan.nextDouble();
                bnk.withdraw(id,amt);
            }//4th case

            if(ch==4) {
                System.out.printf("Enter Your Id: ");
                String id=scan.nextLine();
                bnk.display(id);

            }//5th case

            if(ch==5) bnk.display();
        }
    }
}
