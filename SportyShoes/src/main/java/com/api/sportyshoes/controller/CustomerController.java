package com.api.sportyshoes.controller;

import com.api.sportyshoes.model.Customer;
import com.api.sportyshoes.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService service;

    @PostMapping("/addCustomer")
    public Customer addCustomer(@RequestBody Customer Customer) {
        return service.saveCustomer(Customer);
    }

    @PostMapping("/addCustomers")
    public List<Customer> addCustomers(@RequestBody List<Customer> Customers) {
        return service.saveCustomers(Customers);
    }

    @GetMapping("/Customers")
    public List<Customer> findAllCustomers() {
        return service.getCustomers();
    }

    @GetMapping("/CustomerById/{id}")
    public Customer findCustomerById(@PathVariable int id) {
        return service.getCustomerById(id);
    }

    @GetMapping("/Customer/{name}")
    public Customer findCustomerByName(@PathVariable String name) {
        return service.getCustomerByName(name);
    }

    @PutMapping("/updateCustomer")
    public Customer updateCustomer(@RequestBody Customer Customer) {
        return service.updateCustomer(Customer);
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public void deleteCustomer(@PathVariable int id) {
        service.deleteCustomer(id);
    }
}
