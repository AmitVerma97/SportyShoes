package com.api.sportyshoes.repository;

import com.api.sportyshoes.model.Orders;
//import com.api.sportyshoes.model.Product;
import com.api.sportyshoes.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {

   @Query("SELECT new com.api.sportyshoes.model.Orders(c.name , p.productName) FROM Customer c JOIN c.products p")
    public List<Orders> purchaseReport();
   
    public Customer findByName(String name);
}