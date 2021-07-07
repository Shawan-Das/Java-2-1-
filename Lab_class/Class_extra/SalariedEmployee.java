package Lab_class.Class_extra;

public class SalariedEmployee extends Employee {
    public double monthlySalary;

    public SalariedEmployee(String name, String id, String dsg, double sal){
        super(name,id,dsg);
        this.monthlySalary=sal;
    }

    @Override
    public void increaseSalary(double amt){
        monthlySalary += amt;
    }
    @Override
    public double getSalary(){
        return monthlySalary;
    }
    @Override
    public void display(){
        super.display();
        System.out.printf("Salary:[%f].\n",monthlySalary);
    }
}
