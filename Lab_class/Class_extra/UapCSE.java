package Lab_class.Class_extra;
import Lab_class.Class_6.employee;

import java.util.ArrayList;
public class UapCSE {
    String name;
    ArrayList<Employee> employees;  //ArrayList<Employee> xyz= new ArrayList<>();

    public UapCSE(String name){
        this.name = name;
        employees = new ArrayList<>();
    }
    private void addNewEmployee(Employee e){
        employees.add(e);
    }

    public void addNewEmployee(String n, String i, String d, double s){
        Employee emp = new SalariedEmployee(n,i,d,s);
        addNewEmployee(emp);
    }
    public void addNewEmployee(String n, String i, String d, double hr,int hw){
        Employee emp = new HourlyEmployee(n,i,d,hr,hw);
        addNewEmployee(emp);
    }
    public void addNewEmployee(String n, String i, String d, double p,double s){
        Employee emp = new CommissionEmployee(n,i,d,p,s);
        addNewEmployee(emp);
    }

    private Employee findEmployee(String id){
        for(int i=0;i<employees.size();i++){
            if(employees.get(i).getId().equals(id))
                return employees.get(i);
        }
        return null;
    }
    public void increaseSalary(String id, double amt){
        Employee emp = findEmployee(id);
        if(emp==null) System.out.println("Account Doesn't Exist");
        else if(emp instanceof SalariedEmployee) emp.increaseSalary(amt); //((SalariedEmployee)emp).increaseSalary(amt);
        else if(emp instanceof HourlyEmployee) ((HourlyEmployee)emp).increaseSalary(amt);
        else ((CommissionEmployee)emp).increaseSalary(amt);
    }

    public double getSalary(String id){
        Employee emp = findEmployee(id);
        if(emp==null){ System.out.println("Account Doesn't Exist"); return 0;}
        else if(emp instanceof SalariedEmployee) return ((SalariedEmployee)emp).getSalary();
        else if(emp instanceof HourlyEmployee) return ((HourlyEmployee)emp).getSalary();
        else return ((CommissionEmployee)emp).getSalary();
    }

    public void display(String id){
        Employee emp = findEmployee(id);
        if(emp== null) System.out.println("Employee Doesn't Found");
        else System.out.println(emp);
    }
    void display(){
        for(int i=0;i<employees.size();i++){
            Employee emp= employees.get(i);
            System.out.println(emp);
        }
    }
}
