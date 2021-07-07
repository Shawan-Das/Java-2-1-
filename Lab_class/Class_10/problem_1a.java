package Lab_class.Class_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class problem_1a {
    public static void main(String[] args) throws FileNotFoundException{
        File p= new File("C:\\Users\\User\\Desktop\\Java(2-1)\\src\\Lab_class\\Class_10\\olympic.txt");
        PrintStream info = new PrintStream(new File("C:\\Users\\User\\Desktop\\Java(2-1)\\src\\Lab_class\\Class_10\\new.txt"));
        Scanner scan= new Scanner(p);
        String details=scan.nextLine();
        while(scan.hasNext())
        {
            info.println(details);
            details = scan.nextLine();
        }
        scan.close();
    }
}
