package ie.atu.labexam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
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
