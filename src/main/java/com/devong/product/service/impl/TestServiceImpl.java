package com.devong.product.service.impl;

import com.devong.product.entity.Product;
import com.devong.product.repository.ProductRepository;
import com.devong.product.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    ProductRepository repository;

    @Override
    public List<Product> getProducts() {
        return repository.findAll();
    }

    @Override
    public Product getProduct(long productNumber) {
        return repository.findOne(productNumber);
    }

    @Override
    public void saveProduct(int price, String productName) {
        repository.save(new Product(price,productName));
    }

    @Override
    public void deleteProduct(long productNumber) {
        repository.delete(productNumber);
    }
}
