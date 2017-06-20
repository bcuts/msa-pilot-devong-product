package com.devong.product.service;


import com.devong.product.entity.Product;

import java.util.List;

public interface TestService {
    List<Product> getProducts();
    Product getProduct(long productNumber);
    void saveProduct(int price , String productName);
    void deleteProduct(long productNumber);

}
