package com.gestion.service.api.logic.api;

import com.gestion.service.api.dataaccess.dao.ProductRepository;
import com.gestion.service.api.dataaccess.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product storeProduct(Product product){
        return repository.save(product);
    }

    public List<Product> getProducts(){
        return repository.findAll();
    }

    public Product getProductById(int id){
        return repository.findById(id).orElse(null);
    }
}
