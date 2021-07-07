package exam;

public class TestCar {
    public static void main(String[] args){
        Car car = new Car(3,200);
        Car nitro = new NitroCar(4,200,1.5);
        printCarInfo(car);
        printCarInfo(nitro);
    }
    public static void printCarInfo(Car car){
        System.out.printf("Gear: %d, Speed: %.2f\n",car.gear, car.getSpeed());
    }
}
