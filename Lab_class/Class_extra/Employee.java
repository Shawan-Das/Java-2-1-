package Lab_class.Class_extra;

public abstract class Employee {
    private String name,id,designation;

    public Employee(String name, String id, String dsg)
    {
        this.name=name;
        this.id=id;
        this.designation=dsg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract double getSalary();
    public abstract void increaseSalary(double amt);


    public void display(){
        System.out.printf("Name:[%s]; Id:[%s]; Designation:[%s];\n",name,id,designation);
    }
}
