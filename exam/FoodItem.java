package exam;

import java.time.LocalDate;

import static exam.Category.Food;

public class FoodItem extends Product {	 // make this a subclass of Product
    private LocalDate mfgDate, expirationDate;

    // constructor
    public FoodItem(String name, String id, int quantity, LocalDate mfg, LocalDate exp, double price) {
        super(name, id, Food, quantity, price);
        this.mfgDate = mfg;
        this.expirationDate = exp;
    }

    public LocalDate getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(LocalDate mfgDate) {
        this.mfgDate = mfgDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    // This method will put an item on sale if the item expires
    // within next few days which will be decided by the admin.
    @Override
    public void putOnSale(Object criterion, int p) {

    }

    // This details method is for admin user. Admin should be able to see everything.
    public String details() {
        return super.details()+
                "FoodItem{" +
                "mfgDate='" + mfgDate + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                '}';
    }

}
