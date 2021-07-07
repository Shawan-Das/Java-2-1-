package exam;


public class Clothing extends Product  {// make this a subclass of Product
    private String brand;
    private SubCategory subCategory; // Can use String as well
    private Size size; // Can avaoid enum if you want

    // constructor
    public Clothing(String name, String id, int quantity, double price, String brand, SubCategory subCategory, Size size) {
        super(name, id, Category.Cloth, quantity, price);
        this.brand = brand;
        this.subCategory = subCategory;
        this.size = size;
    }


    // getter/setter
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public SubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(SubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    // Override the putOnSale method
    // This method will put an item on sale and also set the sale percentage
    // The item id ans sale percentage will be decided by the admin.
    @Override
    public void putOnSale(Object id, int percentage) {

    }

    // This details method is for admin user. Admin should be able to see everything.
    // Call details method of parent class and add other info specific to this class
    public String details() {
        return  super.details()+
                "Clothing{" +
                "brand='" + brand + '\'' +
                ", subCategory=" + subCategory +
                ", size=" + size +
                '}';
    }

}
enum SubCategory{
    MEN,
    WOMEN,
    KIDS,
    GIRLS
}
enum Size{
    SMALL,
    MEDIUM,
    LARGE,
    XL,
    XXL
}
