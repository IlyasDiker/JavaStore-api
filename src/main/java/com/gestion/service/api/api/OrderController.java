package com.gestion.service.api.api;

import com.gestion.service.api.dataaccess.entities.Order;
import com.gestion.service.api.logic.api.OrderService;
import com.mysql.cj.log.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/orders")
    public Order createOrder(@RequestBody Order order){
        return service.createOrder(order);
    }

    @GetMapping("/orders")
    public List<Order> findAllProducts(){
        return service.getOrders();
    }

    @GetMapping("/orders/{id}")
    public Order findProductById(@PathVariable int id){
        return service.getOrderById(id);
    }

}
