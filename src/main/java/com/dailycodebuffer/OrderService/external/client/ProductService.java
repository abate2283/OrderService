package com.dailycodebuffer.OrderService.external.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "PRODUCT-SERVICE/products")
public interface ProductService {
    @PutMapping("/reduce-order/{id}")
    ResponseEntity<Void> reduceOrderQuantity(
            @PathVariable("id") long orderId,
            @RequestParam long orderQuantity);
}
