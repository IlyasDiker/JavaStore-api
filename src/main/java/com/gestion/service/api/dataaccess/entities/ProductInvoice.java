package com.gestion.service.api.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class ProductInvoice {

    @EmbeddedId
    ProductInvoiceKey id;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name = "product_id")
    Product product;

    @ManyToOne
    @MapsId("invoiceId")
    @JoinColumn(name = "invoice_id")
    Invoice invoice;

    int quantity;
}
