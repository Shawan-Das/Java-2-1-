package Lab_class.Class_7;
import java.util.Scanner;
public class BankApp {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        Bank info = new Bank();

        while(true)
        {
            System.out.printf("\nExit           : 0 \n");
            System.out.println("New Account     : 1 ");
            System.out.println("Deposit Enter   : 2 ");
            System.out.println("Withdraw Enter  : 3 ");
            System.out.println("Balance Check   : 4 ");
            System.out.println("Account Details : 5 ");
            System.out.println("List of Account : 6 ");

            System.out.printf("Enter Option: ");

            int ch= scan.nextInt();
            if(ch == 0) break;
            else if(ch==1){
                System.out.println("Savings Account: 1   Current Account: 2");
                int k=scan.nextInt();
                   if(k==1){ scan.nextLine();
                       System.out.printf("Your Name: ");
                       String name= scan.nextLine();
                       System.out.printf("Deposit Amount: ");
                       int amt=scan.nextInt();
                       System.out.printf("Maximum Withdraw Amount: ");
                       double mwa=scan.nextDouble();
                       info.addAccount(name,amt,mwa);
                   }
                if(k==2){ scan.nextLine();
                    System.out.printf("Your Name: ");
                    String name= scan.nextLine();
                    System.out.printf("Deposit Amount: ");
                    int amt=scan.nextInt(); scan.nextLine();
                    System.out.printf("Trade License Number: ");
                    String tln=scan.nextLine();
                    info.addAccount(name,amt,tln);
                }
            }

            else if(ch == 2){ scan.nextLine();
                    System.out.printf("Account Number: ");
                    String id=scan.nextLine();
                    System.out.printf("Deposit Amount: ");
                    double amt= scan.nextDouble();
                    info.deposit(id,amt);
                }

            else if(ch == 3) { scan.nextLine();
                    System.out.printf("Account Number: ");
                    String id=scan.nextLine();
                    System.out.printf("Withdraw Amount: ");
                    double amt= scan.nextDouble();
                    info.withdraw(id,amt);
                }

            else if(ch == 4){ scan.nextLine();
                    System.out.printf("Account Number: ");
                    String accountNumber = scan.nextLine();
                info.getBalance(accountNumber);
                }

            else if(ch == 5) { scan.nextLine();
                    System.out.printf("Account Number: ");
                    String id=scan.nextLine();
                    info.display(id);

                }

            else if(ch==6) info.display();
        }
     }
}

