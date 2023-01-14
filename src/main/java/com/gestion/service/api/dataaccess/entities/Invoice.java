package com.gestion.service.api.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "INVOICE")
public class Invoice {
    @Id
    @GeneratedValue
    private int id;

    private String uuid;
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String card_number;
    private String security_code;
    private String expiration;

    @OneToMany(mappedBy = "invoice")
    Set<ProductInvoice> orders;
}