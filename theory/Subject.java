package theory;

public class Subject {
    public double English,Math, Bangla, Religion;
    public Subject(double e, double m, double b, double r){
        this.English = e;
        this.Bangla= b;
        this.Math=m;
        this.Religion=r;
    }

    public String toString() {
        return "Subject{" +
                "English='" + English + '\'' +
                ", Math='" + Math + '\'' +
                ", Bangla='" + Bangla + '\'' +
                ", Religion='" + Religion + '\'' +
                '}';
    }
    public void display(){
        System.out.println(this);
    }
}
