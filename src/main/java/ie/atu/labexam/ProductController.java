package ie.atu.labexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private ProductService productService;
    private WarehouseInterface warehouseInterface;

    @Autowired
    public ProductController(ProductService productService, WarehouseInterface warehouseInterface) {
        this.productService = productService;
        this.warehouseInterface = warehouseInterface;
    }

    @PostMapping("/addprod")
    public String addProduct(@RequestBody ProductData productData){
        productService.addProduct(productData);
        return "Added book";
    }

    @GetMapping("/getprod/{id}")
    public ProductData getProductById(@PathVariable int id){
        return productService.getProductByID(id);
    }
}
