package ProductInventoryAPI.Service;

import ProductInventoryAPI.Model.Electronics;
import ProductInventoryAPI.Model.Grocery;
import ProductInventoryAPI.Model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>();

    public String addElectronics(int id ,String name ,int warrantyDate){
        products.add(new Electronics(id,name,warrantyDate));
        return "Electronics Added Successfully";
    }

    public String addGrocery(int id ,String name ,int expiryDate){
        products.add(new Grocery(id,name,expiryDate));
        return "Grocery Added Successfully";
    }

       public String viewAll(){
        return products.toString() ;
       }

       public String viewById(int id){
        for (Product product : products){
            if (product.getId()==id){
                return product.toString();
            }
        }
        return "Products not found";
       }

       public String updateById(int id, Product newName){
           for (int i = 0; i < products.size() ; i++) {
               if (products.get(i).getId()==id){
                    products.set(i,newName);
                    return "Updated Successfully";
               }

           }
           return "Product not found";
       }

    public String removeById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
                return "Deleted Successfully";
            }
        }
        return "Product not found";
    }

}


