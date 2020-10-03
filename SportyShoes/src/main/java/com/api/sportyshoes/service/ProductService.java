package com.api.sportyshoes.service;

import com.api.sportyshoes.model.Product;
import com.api.sportyshoes.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;

    public Product saveProduct(Product product) {
        return repo.save(product);
    }

    public List<Product> saveProducts(List<Product> products) {
        return repo.saveAll(products);
    }

    public List<Product> getProducts() {
        return repo.findAll();
    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return repo.findByProductName(name);
    }

    public void deleteProduct(int id) {
        repo.deleteById(id);

    }

    public Product updateProduct(Product product) {
        Product existingProduct = repo.findById(product.getPid()).orElse(null);
        existingProduct.setProductName(product.getProductName());
        existingProduct.setCategory(product.getCategory());
        existingProduct.setDate(product.getDate());
        return repo.save(existingProduct);
    }


}