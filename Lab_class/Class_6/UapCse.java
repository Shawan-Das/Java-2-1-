package Lab_class.Class_6;
import java.util.ArrayList;
public class UapCse {
    String name;
    ArrayList<employee> employees;

    public UapCse(String name){
        this.name = name;
        employees = new ArrayList<>();
    }

    public void addNewEmployee(employee e){
       employees.add(e);
   }

    public void addNewEmployee(String nm,String id, String des, double sal){
        employee emp= new employee(nm,id,des,sal);
        addNewEmployee(emp);
    }

    private employee findEmployee(String id){
         for(int i=0;i<employees.size();i++){
             if(employees.get(i).getid().equals(id))
                 return employees.get(i);
         }
         return null;
    }

    public void increaseSalary(String id, double amt){
        employee info = findEmployee(id);
        if(info == null) System.out.println("Employee Doesn't Found");
        else info.increaseSalary(amt);
    }

    double getSalary(String id){
        employee info = findEmployee(id);
        if(info == null){
            System.out.println("Employee Doesn't Found");
        return 0;}
        else return info.getsalary();
    }

    public void display(String id){
        employee info = findEmployee(id);
        if(info == null) System.out.println("Employee Doesn't Found");
        else System.out.println(info);
    }

    void display(){
        for(int i=0;i<employees.size();i++){
            employee info= employees.get(i);
            System.out.println(info);
        }
    }

}
