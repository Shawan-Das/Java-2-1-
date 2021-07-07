package exam;

import java.time.LocalDate;
import java.util.ArrayList;

public class Cart {
    ArrayList<Product> items= new ArrayList<>();

    public void addProduct(Product p) {
        // Add p to products;
        items.add(p);
    }
    public void addProduct(String name, String id, int quantity, LocalDate mfg, LocalDate exp, double price)
    {
        Product p = new FoodItem(name, id, quantity, mfg, exp, price);
        addProduct(p);
    }
    public void addProduct(String name, String id, int quantity, String manufacturer, Electronics.ElectCategory subCategory, double price)
    {
        Product p = new Electronics(name,id,quantity,manufacturer,subCategory, price);
        addProduct(p);
    }
    public void addProduct(String name, String id, int quantity, double price, String brand, SubCategory subCategory, Size size)
    {
        Product p = new Clothing(name,id,quantity,price,brand,subCategory,size);
        addProduct(p);
    }
    // Search for the item in the items list and remove the item;
    public void removeProduct(String id) {
        int p = findProduct(id);
        if(p == -1) System.out.println("Product not found");
        else items.remove(p);
    }

    // Search for the item in the items list and update the quantity of the item;
    public void updateProduct(String id, int count) {
        int p = findProduct(id);
        if(p == -1) System.out.println("Product Not Found");
        else items.get(p).setQuantity(items.get(p).getQuantity()+count);
    }

    // View the items in the cart and their details which include the name, quantity and price
    // If any item is on sale, the discounted price will be shown
    public void viewCart() {
    }

    // clear the items in the cart
    public void clearCart() {
        items.clear();
    }

    // Search for a specific product and return the index in the items arrayList.
    // If the product is not available return -1
    private int findProduct(String id) {
        // search the product in the items list using id.
        // If the product exists return the product, otherwise return null
            for(int i=0; i< items.size(); i++)
            {
                if(items.get(i).getId().equals(id))
                    return i;
            }
            return -1;
    }

}
