package theory;

public class TestAnimal {
    public static void main(String[] args){
        Animal tiger = new Animal("Tiger","Yellow Stripe",4,200.0f,5);
        tiger.display();
        tiger.eat("Deer");
        // Animal sp=new Animal( );
    }
}
