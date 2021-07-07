package Lab_class.Class_4;

import java.util.ArrayList;
import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        ArrayList<BankAccount1> accounts = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int flag=0;
        while (true) {

            System.out.printf("For Exit Enter               : 0 \n");
            System.out.printf("For New Account Enter        : 1 \n");
            System.out.printf("For Deposit Enter            : 2 \n");
            System.out.printf("For Withdraw Enter           : 3 \n");
            System.out.printf("For Display Details Enter    : 4 \n");
            System.out.printf("For Display all account enter: 5 \n");
            System.out.printf("Enter Option: ");
            int ch = scan.nextInt();
            scan.nextLine();

            if (ch == 0) break;

            if (ch == 1) {
                System.out.printf("Create your Account\n");
                System.out.printf("Enter Your Name: ");
                String name = scan.nextLine();
                System.out.printf("Enter Your ID: ");
                String id = scan.nextLine();
                System.out.printf("Enter Your Balance: ");
                double balance = scan.nextDouble();
                BankAccount1 bnk = new BankAccount1(name, id, balance);
                accounts.add(bnk);
            }

            if (ch == 2) {
                System.out.printf("Enter Your Id: ");
                String id = scan.nextLine();
                System.out.printf("Enter Deposit Amount: ");
                double amt = scan.nextDouble();
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).id.equals(id)){
                        accounts.get(i).deposit(amt);  flag =1; break;
                    } else flag =0;
                }
                if(flag==0) System.out.println("Account Doesn't Exist");
            }

            if (ch == 3) {
                System.out.printf("Enter Your Id: ");
                String id = scan.nextLine();
                System.out.printf("Enter Withdraw Amount: ");
                double amt = scan.nextDouble();
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).id.equals(id)){
                        accounts.get(i).withdraw(amt);  flag =1; break;
                    }else flag =0;
                } if(flag==0) System.out.println("Account Doesn't Exist");
            }

            if (ch == 4) {
                System.out.printf("Enter Your Id: ");
                String id = scan.nextLine();
                for (int i = 0; i < accounts.size(); i++) {
                    if (accounts.get(i).id.equals(id)) {
                        System.out.println(accounts.get(i)); flag =1; break;
                    } else flag =0;
                } if(flag==0) System.out.println("Account Doesn't Exist");
            }

            if (ch == 5) {
                for (int i = 0; i < accounts.size(); i++) {
                    System.out.println(accounts.get(i));
                }
            }
        }
    }
}