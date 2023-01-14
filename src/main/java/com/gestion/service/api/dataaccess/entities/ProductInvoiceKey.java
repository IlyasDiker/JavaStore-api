package com.gestion.service.api.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@AllArgsConstructor
@Embeddable
public class ProductInvoiceKey implements Serializable {
    @Column(name = "product_id")
    Long productId;

    @Column(name = "invoice_id")
    Long invoiceId;
}
