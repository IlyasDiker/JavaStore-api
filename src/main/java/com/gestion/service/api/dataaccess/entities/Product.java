package com.gestion.service.api.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PRODUCT")
public class Product {
    @Id
    @GeneratedValue
    private int id;
    private String name;
    private double price;
    private String picture;
}
