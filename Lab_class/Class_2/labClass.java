package Lab_class.Class_2;
public class labClass {
    public static void main(String[] args){
        BankAccount Shan= new BankAccount("Shawan Das","19101020",10000);

        Shan.withdraw(4000);
        Shan.display();
        Shan.deposit(2000);
        Shan.withdraw(12000);
        Shan.display();
    }
}
