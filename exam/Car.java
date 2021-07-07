package exam;

public class Car {
    int gear;
    private double speed;

    public Car(int gear, double speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void accelerate(double acceleration){
        speed += acceleration;
    }

    public double getSpeed(){
        return speed;
    }
}
