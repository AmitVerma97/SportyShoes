package com.api.sportyshoes.service;

import com.api.sportyshoes.model.Customer;
//import com.api.sportyshoes.model.Product;
import com.api.sportyshoes.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository repository;

    public Customer saveCustomer(Customer Customer) {
        return repository.save(Customer);
    }

    public List<Customer> saveCustomers(List<Customer> Customers) {
        return repository.saveAll(Customers);
    }

    public List<Customer> getCustomers() {
        return repository.findAll();
    }

    public Customer getCustomerById(int id) {
        return repository.findById(id).orElse(null);
    }

    public Customer getCustomerByName(String name) {
        return repository.findByName(name);
    }

    public void deleteCustomer(int id) {
        repository.deleteById(id);

    }

    public Customer updateCustomer(Customer Customer) {
        Customer existingCustomer = repository.findById(Customer.getId()).orElse(null);
        existingCustomer.setName(Customer.getName());
    
        return repository.save(existingCustomer);
    }


}