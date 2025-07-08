package ProductInventoryAPI.Model;

public class Electronics extends Product {

        private int warrantyDate;
        public int getWarrantyDate() {
            return warrantyDate;
        }

        public void setWarrantyDate(int warrantyDate) {
            this.warrantyDate = warrantyDate;
        }

        public Electronics(int id, String name, int warrantyDate) {
            super(id, name);
            this.warrantyDate = warrantyDate;
        }

    @Override
    public String toString() {
        return "Electronics{" +
                "id=" + getId() + ", " +
                "name='" + getName() + "', " +
                "warrantyDate=" + warrantyDate +
                '}';
    }

    @Override
    public void calculatePrice() {
        System.out.println("Price of Electronic is : ");
    }
}


