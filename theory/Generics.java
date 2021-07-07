package theory;

public class Generics {
    public static <T> void showNumbers(T[]list){
        System.out.println("List contains the following numbers.");
        for(T i: list){
            System.out.println(i+ " ");
            System.out.println();
        }
    }


    public static void main(String[] args){
        Integer[] iList = {1,2,3,4,5};
        Double[] dList = {1.0, 2.5, 3.7, 7.9};
        Float[]  fList = {1.2f, 5.2f, 7.3f, 9.7f};
        Character[] cList= {'a', 'b', 'c', 'd'};
        showNumbers(iList);
        showNumbers(dList);
        showNumbers(fList);
        showNumbers(cList);
    }
}
