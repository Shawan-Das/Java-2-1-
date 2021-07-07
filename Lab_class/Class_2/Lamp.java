package Lab_class.Class_2;
public class Lamp {
    public float power;
    boolean isOn;
    void turnOn(){
        isOn=true;
    }
    void turnOff(){
        isOn=false;
    }
    float getPower(){
        return power;
    }
    boolean inOn( ){
        return isOn;
    }
}
