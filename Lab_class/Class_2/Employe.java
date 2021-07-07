package Lab_class.Class_2;
public class Employe {
    public String name,id,position;
    double salary;

    Employe(String name, String id, String position, double salary){
        this.name=name;
        this.id=id;
        this.position=position;
        this.salary=salary;
    }

    void updateSalary(double newSal){
        salary=salary+newSal;
    }
    double getSalary(){
        return salary;
    }
    void display(){
        System.out.printf("Name: %s \nID: %s\n,Position: %s\nSalary: %f\n",name,id,position,salary);
    }
}
