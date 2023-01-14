package com.gestion.service.api.dataaccess.dao;

import com.gestion.service.api.dataaccess.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {

}
