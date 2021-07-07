package Lab_class.Class_extra;

public class HourlyEmployee extends Employee {
    public double hourRate; public int hourWorked;
    public HourlyEmployee(String name, String id, String dsg, double rate, int work)
    {
        super(name,id,dsg);
        this.hourRate=rate;
        this.hourWorked=work;
    }

    public double getSalary(int hWorked){
        return hWorked*hourRate;
    } //overloading

    @Override
    public void increaseSalary(double amt){
        hourRate += amt;
    }
    @Override
    public double getSalary(){
       return  getSalary(hourWorked)*30;
    }
    @Override
    public void display(){
        super.display();
        System.out.printf("Rate:[%f]\n",hourRate);
    }
}
