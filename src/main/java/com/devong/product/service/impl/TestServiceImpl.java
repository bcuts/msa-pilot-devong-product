package com.devong.product.service.impl;

import com.devong.product.entity.Product;
import com.devong.product.service.TestService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public List<Product> getProducts() {
        List<Product> returnList = new ArrayList<>();
        returnList.add(new Product(8900, "또봉이통닭"));
        returnList.add(new Product(11000, "양념통닭"));
        returnList.add(new Product(11000, "양념통닭"));
        return null;
    }
}
