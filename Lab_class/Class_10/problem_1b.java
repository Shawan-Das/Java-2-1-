package Lab_class.Class_10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.PrimitiveIterator;
import java.util.Scanner;

public class problem_1b {
    public static void main(String[] args) throws FileNotFoundException{
        String name;
        int gold, silver,bronze,total;
        File p= new File("C:\\Users\\User\\Desktop\\Java(2-1)\\src\\Lab_class\\Class_10\\olympic.txt");
        PrintStream info = new PrintStream(new File("C:\\Users\\User\\Desktop\\Java(2-1)\\src\\Lab_class\\Class_10\\processedB.txt"));
        Scanner scan= new Scanner(p);
        while(scan.hasNext())
        {
            name = scan.next();
            gold = scan.nextInt();
            silver = scan.nextInt();
            bronze = scan.nextInt();
            total = gold+silver+bronze;
            info.println(name+" "+gold+" "+bronze+" "+total);
        }
        scan.close();
    }
}
