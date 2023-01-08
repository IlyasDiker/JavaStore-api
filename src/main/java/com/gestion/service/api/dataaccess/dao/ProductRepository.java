package com.gestion.service.api.dataaccess.dao;

import com.gestion.service.api.dataaccess.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {

}
