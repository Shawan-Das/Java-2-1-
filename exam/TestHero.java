package exam;

public class TestHero {
    public static void main(String[] args){
        SuperHero hero = new SuperHero("OOPAvenger",10,"Immortal");
        System.out.println(hero.energyLevel);
        System.out.println(hero.name);
        System.out.println(hero.getsecretPower());
    }
}
