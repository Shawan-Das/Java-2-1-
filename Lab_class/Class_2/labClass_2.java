package Lab_class.Class_2;
public class labClass_2 {
    public static void main(String[] args){
        Employe masud=new Employe("Masud Rana","18820029","Head Professor",50000);

        System.out.printf("Salary: %f\n",masud.salary);
        masud.updateSalary(30000);
        masud.display();
    }
}
