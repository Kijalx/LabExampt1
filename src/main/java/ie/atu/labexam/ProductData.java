package ie.atu.labexam;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductData {
    public int productId;
    public String productName;
    public int quantity;
    public int warehouseId;
}
