package Lab_class.Class_9;
import java.util.InputMismatchException;
import java.util.Scanner;
public class TestException {
    public static void main(String[] args){
        while(true){
            try{
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter 2 integers.");
                int a= scan.nextInt();
                int b= Integer.parseInt(scan.next().trim());
                int c = a / b;
                System.out.println("Result: "+c);
                scan.close(); break;
            } catch(InputMismatchException e){
                System.out.println("Enter an Integer");
            }
            catch(NumberFormatException e){
                System.out.println("enter a number");
            }
            catch(ArithmeticException e){
                System.out.println("infinite");
            }
        }




        /*try{
            System.out.println("Enter 2 integers.");
            int a= scan.nextInt();//input miss match
            int b= Integer.parseInt(scan.next().trim());//number format
            //if(b==0) throw new ArithmeticException("Infinite answer");
                int c = a / b;//Arth
                System.out.println("Result: "+c);
        }catch(InputMismatchException e){
            System.out.println("Enter integer");
        }catch(NumberFormatException e){
            System.out.println("enter Integer");
        }
        catch(ArithmeticException e){
            System.out.println("Infinite");
        }
        scan.close();*/
    }
}
