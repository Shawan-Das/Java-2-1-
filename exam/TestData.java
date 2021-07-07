package exam;

import java.beans.Transient;
import java.io.*;

public class TestData {
    public static void main(String[] args) throws Exception{
        FileOutputStream fos = new FileOutputStream("data.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(new Email("Test","Test123"));

        FileInputStream fis = new FileInputStream("data.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Email email = (Email)ois.readObject();

        email.display();
    }

    static class Email implements Serializable{
        String id;
        transient String pwd;
        public Email(String id, String pwd){
            this.id= id;
            this.pwd=pwd;
        }
        public void display(){
            System.out.println("id="+id+", pwd="+pwd);
        }
    }
}
