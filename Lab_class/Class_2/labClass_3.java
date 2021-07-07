package Lab_class.Class_2;
public class labClass_3 {
    public static void main(String[] args){
        Lamp myLamp=new Lamp();
        myLamp.power=2.5F;
        myLamp.turnOn();
        myLamp.turnOff();
        myLamp.inOn();
        System.out.println(myLamp.getPower());
    }
}
