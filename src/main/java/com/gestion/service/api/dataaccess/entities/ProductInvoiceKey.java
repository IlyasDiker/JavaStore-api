package com.gestion.service.api.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Column;
import java.io.Serializable;

@Data
@AllArgsConstructor
public class ProductInvoiceKey implements Serializable {
    @Column(name = "product_id")
    Long productId;

    @Column(name = "invoice_id")
    Long invoiceId;
}
