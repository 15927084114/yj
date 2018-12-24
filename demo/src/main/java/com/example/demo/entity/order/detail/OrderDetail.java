package com.example.demo.entity.order.detail;

import lombok.Data;

@Data
public class OrderDetail {
    private String  commodity_Name;
    private double  ccommodity_Price;
    private Integer  commodity_Num;
    private double  commodity_Total;
}
