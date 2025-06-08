package ProductInventoryAPI.Controller;

import ProductInventoryAPI.Model.Electronics;
import ProductInventoryAPI.Model.Grocery;
import ProductInventoryAPI.Model.Product;
import ProductInventoryAPI.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/Product")
public class ProductController {

     @Autowired
    ProductService productService;


    // Post method accepting a JSON body and mapping it to Electronics using constructor
    @PostMapping("/Electronics")
    public String addElectronics(@RequestBody Electronics electronics){
     return productService.addElectronics(electronics.getId(),electronics.getName(),electronics.getWarrantyDate()) ;
    }

    @PostMapping("/Grocery")
    public String addGrocery(@RequestBody Grocery grocery){
        return productService.addGrocery(grocery.getId(),grocery.getName(),grocery.getExpiryDate()) ;
    }

    @GetMapping
    public String viewAll(){
        return productService.viewAll();
    }

@GetMapping("/{id}")
    public String viewById(@PathVariable  int id){
        return productService.viewById(id);
    }

    @PutMapping("/{id}")
    public String updateById(@PathVariable int id, @RequestBody Product newName){
        return productService.updateById(id,newName);
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id){
        return productService.removeById(id);
    }

}
