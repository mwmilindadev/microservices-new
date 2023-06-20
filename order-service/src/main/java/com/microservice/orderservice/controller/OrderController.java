package com.microservice.orderservice.controller;

import com.microservice.orderservice.dto.OrderReqest;
import com.microservice.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping
    public String placeOrder(@RequestBody OrderReqest orderReqest){
        orderService.placeOrder(orderReqest);
        return "Place Order Successfully";
    }
}
