package com.gestion.service.api.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @Column(columnDefinition = "LONGTEXT")
    private String picture;
}
