package Lab_class.Class_extra;

public class CommissionEmployee extends Employee{
    public double commission, sale;
    public CommissionEmployee(String name, String id, String dsg,double cms,double sale)
    {
        super(name,id,dsg);
        this.commission=cms;
        this.sale=sale;
    }

    public double getSalary(double sale){
        return commission*sale;
    }
    @Override
    public void increaseSalary(double amt){
        commission += amt;
    }
    @Override
    public double getSalary(){
        return  commission*sale;
    }
    @Override
    public void display(){
        super.display();
        System.out.printf("Commission:[%f]\n",commission);
    }
}
