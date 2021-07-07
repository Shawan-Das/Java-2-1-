package Lab_class.Class_9;
import java.io.IOException;
import java.security.InvalidParameterException;
public class TestException2 {
    public static void main(String[] args) throws Exception {
        //throwException(105);
        throwException(-5);

    }
    public static void throwException(int n) throws InvalidParameterException,Exception {
       // Integer.parseInt("2");
        if(n<=0) throw new Exception("Parameter must be greater than 0");
        if(n>100) throw new Exception("Parameter must be smaller than 100");
        System.out.println(n*n);
    }
}
//throw new InvalidParameterException("message");
