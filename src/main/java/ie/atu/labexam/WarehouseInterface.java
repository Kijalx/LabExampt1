package ie.atu.labexam;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "Warehouse", url = "https://localhost:8081/")
public interface WarehouseInterface {

}
