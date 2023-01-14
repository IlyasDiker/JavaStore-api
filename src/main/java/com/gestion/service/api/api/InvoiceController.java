package com.gestion.service.api.api;

import com.gestion.service.api.dataaccess.entities.Invoice;
import com.gestion.service.api.logic.api.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class InvoiceController {

    @Autowired
    private InvoiceService service;

    @PostMapping("/invoices")
    public Invoice createOrder(@RequestBody Invoice invoice){
        return service.createInvoice(invoice);
    }

    @GetMapping("/invoices")
    public List<Invoice> findAllProducts(){
        return service.getInvoices();
    }

    @GetMapping("/invoices/{id}")
    public Invoice findProductById(@PathVariable int id){
        return service.getInvoiceById(id);
    }

}
