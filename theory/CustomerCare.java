package theory;

public class CustomerCare implements Greeting {
    @Override
    public void sayHi() {
        System.out.println("A very good day");
    }

    @Override
    public void sayBye() {
        System.out.println("Be Safe");
    }

    @Override
    public void smile() {
        System.out.println("Welcome with smile");
    }
}
