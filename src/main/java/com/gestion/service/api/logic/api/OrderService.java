package com.gestion.service.api.logic.api;

import com.gestion.service.api.dataaccess.dao.OrderRepository;
import com.gestion.service.api.dataaccess.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    private OrderRepository repository;

    public Order createOrder(Order order){
        return repository.save(order);
    }

    public List<Order> getOrders(){
        return repository.findAll();
    }

    public Order getOrderById(int id){
        return repository.findById(id).orElse(null);
    }
}
