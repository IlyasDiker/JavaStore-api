package com.gestion.service.api.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    @ManyToOne(fetch=FetchType.LAZY)
    private Product product;
    private String uuid;

    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String card_number;
    private String security_code;
    private String expiration;
}