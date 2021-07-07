package Lab_class.Class_extra;
import java.util.Scanner;
public class UAP {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Department Name: ");
        String dName= scan.nextLine();
        UapCSE myUap = new UapCSE(dName);

        while(true)
        {
            int ch= scan.nextInt();
            System.out.println("Exit System          : 0");
            System.out.println("Add Employee         : 1");
            System.out.println("Get Salary           : 2");
            System.out.println("Increase Salary      : 3");
            System.out.println("Employee Information : 4");
            System.out.println("Display All Employee : 5");

            if(ch==0) break;
            if(ch==5) myUap.display();
            if(ch==1){ scan.nextLine();
                System.out.println("Salaried   Employee : 1");
                System.out.println("Hourly     Employee : 2");
                System.out.println("Commission Employee : 3");
                int hc= scan.nextInt(); scan.nextLine();
                System.out.printf("Name: ");        String name=scan.nextLine();
                System.out.printf("ID: ");          String id=scan.nextLine();
                System.out.printf("Designation: "); String dsg=scan.nextLine();

                if(hc==1){
                    System.out.printf("Monthly Salary: "); int msal=scan.nextInt();
                    myUap.addNewEmployee(name,id,dsg,msal);
                }
                if(hc==2){
                    System.out.printf("Rate per Hour: "); double rate=scan.nextDouble();
                    System.out.printf("Working  Hour: "); int work=scan.nextInt();
                    myUap.addNewEmployee(name,id,dsg,rate,work);
                }
                if(hc==3){
                    System.out.printf("Commission : "); double cms=scan.nextDouble();
                    System.out.printf("Salary     : "); double sal=scan.nextDouble();
                    myUap.addNewEmployee(name,id,dsg,cms,sal);
                }
            }

            if(ch==2){ scan.nextLine();
                System.out.printf("Employee ID: ");      String id=scan.nextLine();
                System.out.printf("Salary Amount: %f\n",myUap.getSalary(id));
            }

            if(ch==3){ scan.nextLine();
                System.out.printf("Employee ID: ");      String id=scan.nextLine();
                System.out.printf("Increment Amount: "); double amt=scan.nextDouble();
                myUap.increaseSalary(id,amt);
            }

            if(ch==4){ scan.nextLine();
                System.out.printf("Employee ID: ");      String id=scan.nextLine();
                myUap.display(id);
            }
        }
    }
}
