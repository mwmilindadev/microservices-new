package com.microservice.orderservice.serviseImpl;

import com.microservice.orderservice.dto.OrderReqest;
import com.microservice.orderservice.model.Order;
import com.microservice.orderservice.repository.OrderRepository;
import com.microservice.orderservice.service.OrderService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiseImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private ModelMapper modelMapper;
    @Override
    public void placeOrder(OrderReqest orderReqest) {
        Order order = modelMapper.map(orderReqest,Order.class);
        orderRepository.save(order);



    }
}
