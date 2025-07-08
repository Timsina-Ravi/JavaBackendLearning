/*

 ✅ 1. Product Inventory API
Objective:
Build an API to manage different product types with varying pricing logic.
Concepts Covered:
- Abstraction via abstract class for `Product`
- Inheritance with `Electronics` and `Grocery`
- Polymorphism via method overriding
- Encapsulation in product fields
- Interface for price calculation
- Use `ArrayList<Product>` as storage

Endpoints:
1. Add an electronics product
2. Add a grocery product
3. Get all products
4. Get product and its price by ID
5. Update product name
6. Delete a product

 */

package ProductInventoryAPI.Model;



public abstract class Product implements Method {
    private int id;
   private String name;

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public abstract String toString();
}
