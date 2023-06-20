package com.microservice.orderservice.service;

import com.microservice.orderservice.dto.OrderReqest;

public interface OrderService {
    void placeOrder(OrderReqest orderReqest);
}
