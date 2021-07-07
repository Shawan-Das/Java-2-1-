package theory;

import java.io.*;

public class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String [] args){
        try{

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
