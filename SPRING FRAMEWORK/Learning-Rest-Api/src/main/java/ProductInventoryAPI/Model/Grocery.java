package ProductInventoryAPI.Model;

public class Grocery extends Product {

   private int expiryDate;

    public int getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(int expiryDate) {
        this.expiryDate = expiryDate;
    }

    public Grocery(int id, String name, int expiryDate) {
        super(id, name);
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return "Grocery{" +
                "id=" + getId() + ", " +
                "name='" + getName() + "', " +
                "expiryDate=" + expiryDate +
                '}';
    }
    @Override
    public void calculatePrice() {
        System.out.println("Price of Grocery is: " );
    }
}
