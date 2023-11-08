package ie.atu.labexam;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<ProductData> product = new ArrayList<>();
    public void addProduct(ProductData productData){
        product.add(productData);
    }

    public ProductData getProductByID(int id){
        return product.get(id);
    }
}
