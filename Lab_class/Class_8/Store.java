package Lab_class.Class_8;

public class Store {
    public String name,id,type; double price; int numberOfItem;

    Store(String name, String id, double price, String type, int noi){
        this.name=name;
        this.id=id;
        this.price=price;
        this.type=type;
        this.numberOfItem=noi;
    }
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                ", numberOfItem=" + numberOfItem +
                '}';
    }
}
