package com.example.demo.entity.order;

import com.example.demo.entity.order.detail.OrderDetail;
import lombok.Data;

@Data
public class Order {
    private String orderNo;
    private String orderName;
    private OrderDetail orderDetail;
    private String order_buyer;
    private String order_solder;
}
