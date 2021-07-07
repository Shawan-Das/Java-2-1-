package exam;

public class TestBunny {
    public String name,color;
    public static float weight;
    public static int bunnyCount=0;

    public void dispaly(){
        System.out.println(name+":"+color+":"+bunnyCount);
    }

    public static int addBunny(){
        bunnyCount++;
        weight++;
        return 0;
    }

}
