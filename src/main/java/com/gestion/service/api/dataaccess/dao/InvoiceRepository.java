package com.gestion.service.api.dataaccess.dao;

import com.gestion.service.api.dataaccess.entities.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {

}
