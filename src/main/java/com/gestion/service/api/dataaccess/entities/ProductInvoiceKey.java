package com.gestion.service.api.dataaccess.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@Embeddable
public class ProductInvoiceKey implements Serializable {
    @Column(name = "product_id")
    Long productId;

    @Column(name = "invoice_id")
    Long invoiceId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductInvoiceKey that = (ProductInvoiceKey) o;
        return productId.equals(that.productId) && invoiceId.equals(that.invoiceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productId, invoiceId);
    }
}
