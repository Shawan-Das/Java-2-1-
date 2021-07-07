package Lab_class.Class_8;
import java.util.ArrayList;
import java.util.Scanner;
public class StoreManagement {
    ArrayList<Store> store = new ArrayList<>();
   // Scanner scan= new Scanner(System.in);
    private Store findItem(String exmp)
    {
        for(int i=0;i<store.size();i++){
                     if(store.get(i).id.equals(exmp))           return store.get(i);
                else if (store.get(i).name.equals(exmp))          return store.get(i);
        }
            return null;
    }

    public void sellItem(String name, int noi){
        Store str = findItem(name);
            if(str==null) System.out.println("Product Not available");
            else if (str.numberOfItem >= noi) {
                str.numberOfItem -= noi;
                System.out.printf("Total Cost: %f\n",noi*str.price);
            }
            else System.out.println("Enough Product Not available");
    }

    public void newItem(String name,String id,double price,String type, int noi){
        Store str = new Store(name,id,price,type,noi);
        store.add(str);
        System.out.printf("Total Cost: %f\n",noi*price);
    }

    public void oderItem(String id,int noi){
        Store str= findItem(id);
        if(str==null) System.out.println("Product Not available");
        else{
            str.numberOfItem +=noi;
            System.out.printf("Total Cost: %f\n",noi*str.price);
        }
    }

    void display(String id){
        Store str = findItem(id);
        if(str == null) System.out.println("Product Not available");
        else System.out.println(str);
    }

    void display(){
        for(int i=0; i<store.size();i++)
            System.out.println(store.get(i));
    }

}
