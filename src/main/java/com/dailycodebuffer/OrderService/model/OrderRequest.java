package com.dailycodebuffer.OrderService.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Log4j2
public class OrderRequest {

    private long productId;
    private long totalAmount;
    private long quantity;
    private PaymentMode paymentMode;

}
