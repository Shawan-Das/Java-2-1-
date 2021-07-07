package exam;

public class Reptile {
    public String name;
    public Boolean layEgg;

    public Reptile(String name, Boolean layEgg) {
        this.name = name;
        this.layEgg = layEgg;
    }

    public void reproduction(Boolean layEgg)
    {
        if(layEgg) System.out.println("Reproduce by Hatching eggs");
        else System.out.println("Give birth to live young");
    }

    public String getGenderOfOffspring(int temp)
    {
        if(layEgg && temp>32) return "female";
        if(layEgg && temp<28) return "male";
        else return "male or female";
    }
}
