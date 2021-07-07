package exam;

public class NitroCar extends Car{
    double nitro;

    public NitroCar(int gear, double speed, double nitro) {
        super(gear, speed);
        this.nitro = nitro;
    }
    @Override
    public double getSpeed(){
        return (super.getSpeed()*nitro);
    }
}
