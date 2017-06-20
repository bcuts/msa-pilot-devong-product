package com.devong.product.entity;

import com.devong.product.repository.ProductRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private ProductRepository productRepository;

    private Logger log = Logger.getLogger(ProductLoader.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Product chicken1 = new Product(8800,"또봉이");
        productRepository.save(chicken1);

        log.info("Saved chicken1 - id: " + chicken1.getProductName());

        Product chicken2 = new Product(12000,"또봉이 후라이드");
        productRepository.save(chicken2);

        log.info("Saved chicken2 - id: " + chicken2.getProductName());

        Product chicken3 = new Product(13000,"또봉이 양념치킨");
        productRepository.save(chicken3);

        log.info("Saved chicken3 - id: " + chicken3.getProductName());

    }
}