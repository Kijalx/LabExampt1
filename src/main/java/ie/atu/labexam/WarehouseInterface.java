package ie.atu.labexam;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Objects;

@FeignClient(name = "Warehouse", url = "https://localhost:8081/")
public interface WarehouseInterface {
    @PostMapping("/warehouseId")
    WarehouseData warehouseDetails(@RequestBody ProductData productData);


}
