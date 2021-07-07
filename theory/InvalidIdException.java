package theory;

public class InvalidIdException extends Exception {
    public InvalidIdException(String id){
        super(id+" is not a valid ID");
    }
}
