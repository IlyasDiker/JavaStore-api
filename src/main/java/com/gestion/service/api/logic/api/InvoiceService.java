package com.gestion.service.api.logic.api;

import com.gestion.service.api.dataaccess.dao.InvoiceRepository;
import com.gestion.service.api.dataaccess.entities.Invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    @Autowired
    private InvoiceRepository repository;

    public Invoice createInvoice(Invoice order){
        return repository.save(order);
    }

    public List<Invoice> getInvoices(){
        return repository.findAll();
    }

    public Invoice getInvoiceById(int id){
        return repository.findById(id).orElse(null);
    }
}
