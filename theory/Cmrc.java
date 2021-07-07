package theory;

public class Cmrc extends Subject {
    public double Finance,Accounting, G_Science;

    public Cmrc(double x, double m, double b, double r,double finance, double accounting, double g_Science) {
        super(x, m, b, r);
        Finance = finance;
        Accounting = accounting;
        G_Science = g_Science;
    }
    public String toString() {
        return "Cmrc{" +
                "Finance=" + Finance +
                ", Accounting=" + Accounting +
                ", G_Science=" + G_Science +
                '}';
    }
    public void display(){
        super.display();
        System.out.println(this);
    }
}
