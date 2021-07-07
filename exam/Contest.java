package exam;

import java.util.Scanner;

public class Contest {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Hackathon info = new Hackathon();

        while(true)
        {
            System.out.println("Exit System       : 0");
            System.out.println("Add Team          : 1");
            System.out.println("Update marks      : 2");
            System.out.println("Team Information  : 3");
            System.out.println("All Teams         : 4");
            System.out.println("Winners           : 5");

            System.out.printf("Enter Option: ");
            int ch = scan.nextInt();
             scan.nextLine();
            if(ch==0) break;

            if(ch==1)
            {
                System.out.printf("Team Name : ");
                String name= scan.nextLine();
                System.out.printf("Member 1 : ");
                String m1= scan.nextLine();
                System.out.printf("Member 2 : ");
                String m2= scan.nextLine();
                System.out.printf("Member 3 : ");
                String m3= scan.nextLine();
                System.out.printf("Judge-1 Marks : ");
                double j1= scan.nextDouble();
                System.out.printf("Judge-2 Marks : ");
                double j2= scan.nextDouble();
                System.out.printf("Judge-3 Marks : ");
                double j3= scan.nextDouble();
                scan.nextLine();
                info.addTeam(name, m1,m2,m3,j1,j2,j3);
            }

            if(ch==2)
            {
                System.out.printf("Team Name : ");
                String name= scan.nextLine();
                System.out.printf("Judge : ");
                int j= scan.nextInt();
                System.out.printf("Marks : ");
                double m= scan.nextDouble();
                scan.nextLine();
                info.marksUpdate(name,j,m);
            }

            if(ch==3)
            {
                System.out.printf("Team Name : ");
                String name= scan.nextLine();
                info.display(name);
            }

            if(ch==4) info.display();

            if(ch==5) info.winner();
        }

    }
}
