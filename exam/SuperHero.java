package exam;

public class SuperHero {
    public String name;
    public static int energyLevel;
    private String secretPower;
    public String getsecretPower(){
        return secretPower;
    }

    public SuperHero(String n, int eLevel, String secP){
        name=n;
        energyLevel = eLevel;
        secretPower = secP;
    }
    public void increaseEnergy(){
        energyLevel++;
    }
}
