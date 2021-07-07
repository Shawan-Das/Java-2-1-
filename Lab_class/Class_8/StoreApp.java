package Lab_class.Class_8;
import java.util.Scanner;
public class StoreApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StoreManagement app = new StoreManagement();
        System.out.println("Choose Your Options");
        while (true) {
            System.out.printf("Exit              : 0 \n");
            System.out.printf("Add New Item      : 1 \n");
            System.out.printf("List of all Item  : 2 \n");
            System.out.printf("Item Details      : 3 \n");
            System.out.printf("Sell Item         : 4 \n");
            System.out.printf("Add Existing Item : 5 \n");
            int ch = scan.nextInt();
            scan.nextLine();
            if (ch == 0) break;
            if (ch == 1) {
                System.out.printf("Enter Product name: ");
                String name = scan.nextLine();
                System.out.printf("Product ID: ");
                String id = scan.nextLine();
                System.out.printf("Product Price: ");
                double price = scan.nextInt(); scan.nextLine();
                System.out.printf("Product Type: ");
                String type = scan.nextLine();
                System.out.printf("Enter Number of Items: ");
                int noi = scan.nextInt();
                app.newItem(name,id,price,type,noi);
            }
            if (ch == 2) {
                app.display();
            }
            if (ch == 3) {
                System.out.printf("Enter Product ID: ");
                String id = scan.nextLine();
                app.display(id);
            }
            if (ch == 4) {
                System.out.printf("Enter Product name: ");
                String name = scan.nextLine();
                System.out.printf("Enter Number of Items: ");
                int noi = scan.nextInt();
                app.sellItem(name, noi);
            }
            if (ch == 5) {
                System.out.printf("Enter Product ID: ");
                String id = scan.nextLine();
                System.out.printf("Enter Number of Items: ");
                int noi = scan.nextInt();
                app.oderItem(id, noi);
            }
        }
    }

}
