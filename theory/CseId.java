package theory;

import java.util.Scanner;

public class CseId {
    public static void main(String[] args)
    {
        try{
            Scanner scan = new Scanner(System.in);
            String id = scan.nextLine();
            checkCseId(id);
            System.out.println("Successful");
        }catch(InvalidIdException e){
            System.out.println(e.getMessage());
        }
    }

    public static void checkCseId(String id) throws InvalidIdException{
        char ch1 = id.charAt(3);
        char ch2 = id.charAt(4);
        int digits = id.length();
         if(digits != 8) throw new InvalidIdException(id);
         else if(ch1== '0' && ch2=='1') System.out.println(id+" is a valid id");
         else throw new InvalidIdException(id);
    }
}
