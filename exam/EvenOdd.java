package exam;

import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] number = new int[size];

        for(int i=0; i<size; i++)
        {
            number[i] = scan.nextInt();
        }

        for(int i=0; i<size; i++)
        {
            if(getLength(number[i])%2==0)
                System.out.println(number[i] + " ");
        }

    }

    public static int getLength(int num)
    {
        int length=0;
        while(num!=0)
        {
            num=num%10;
            length++;
        }
        return length;
    }


}
