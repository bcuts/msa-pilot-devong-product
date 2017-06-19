package com.devong.product.entity;

import javax.persistence.*;

@Entity
@Table
public class Hello {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;

    String name;

    public Hello() {
    }

    public Hello(String name) {
        this.name = name;
    }
}
