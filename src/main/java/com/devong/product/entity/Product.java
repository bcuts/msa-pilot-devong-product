package com.devong.product.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Product implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.AUTO)
    long productNumber;

    @Column(nullable = false)
    int price;
    @Column(nullable = false)
    String productName;

    protected Product() {
        // no-args constructor required by JPA spec
        // this one is protected since it shouldn't be used directly
    }

    public Product(int price, String productName) {
        this.price = price;
        this.productName = productName;
    }

    public long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(int productNumber) {
        this.productNumber = productNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNumber=" + productNumber +
                ", price=" + price +
                ", productName='" + productName + '\'' +
                '}';
    }
}
