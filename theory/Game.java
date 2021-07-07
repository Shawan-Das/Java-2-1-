package theory;

class Game{
    String name;
    int noOfPlayer;
    Game(){
        noOfPlayer =2;
    }

    public void info(){
        System.out.println("Player needed at least "+noOfPlayer);
    }
}