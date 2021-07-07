package theory;

import java.sql.SQLOutput;

public class Science extends Subject {
    public double Physics, Chemistry, Biology;

    public Science(double x, double m, double b, double r,double p, double c, double B){
        super(x,m,b,r);
        this.Physics=p;
        this.Chemistry=c;
        this.Biology=B;
    }
    public String toString() {
        return "Science{" +
                "Physics=" + Physics +
                ", Chemistry=" + Chemistry +
                ", Biology=" + Biology +
                '}';
    }
 @Override
    public void display(){
        display();
        System.out.println(this);
    }
}
