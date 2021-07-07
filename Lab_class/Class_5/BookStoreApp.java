package Lab_class.Class_5;
import java.util.Scanner;
public class BookStoreApp {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
         BookStore bks= new BookStore();
        System.out.printf("For Exit Enter               : 0 \n");
        System.out.printf("For Display                  : 1 \n");
        System.out.printf("For Order Book Enter         : 2 \n");
        System.out.printf("For Sell Books Enter         : 3 \n");


        while(true)
        {
            System.out.printf("Enter Option: ");
            int ch = scan.nextInt();
            scan.nextLine();
            if (ch == 0) break;
            if (ch == 1)  bks.display();
            if (ch == 2){
                System.out.printf("Enter ISBN: ");
                //scan.nextLine();
                String isbn= scan.nextLine();
                System.out.printf("Enter Quantity: ");
                int qn=scan.nextInt();
                 bks.order(isbn, qn);
            }
            if (ch == 3){
                System.out.printf("Enter Book Name: ");
                //scan.nextLine();
                String title= scan.nextLine();
                System.out.printf("Enter Quantity: ");
                int qn=scan.nextInt();
                bks.sell(title, qn);
            }
        }
    }

}
