package com.devong.product.controller;


import com.devong.product.entity.Product;
import com.devong.product.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    TestService service;

    @GetMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

    @GetMapping(value = "/products")
    List<Product> getProducts() {
        return service.getProducts();
    }

    @GetMapping(value = "/product/{productNumber}")
    Product getProduct(@PathVariable long productNumber) {
        Product product = service.getProduct(productNumber);

        return service.getProduct(productNumber);
    }

    @PutMapping(value = "/product")
    void saveProduct(@PathVariable String productName,@PathVariable int price) {
        service.saveProduct(price , productName);
    }

    @DeleteMapping(value = "/product")
    void deleteProduct(@PathVariable long productNumber) {
        service.deleteProduct(productNumber);
    }




}
