package theory;

public class Dog implements Pet {
    @Override
    public  void beFriendly(){
        System.out.println("Friendly");
    }
    @Override
    public void play(){
        System.out.println("Love to play With Human");
    }
    @Override
    public boolean isFriendly(){
        return true;
    }
}
