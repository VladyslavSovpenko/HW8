package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
    @Id
    @GeneratedValue(generator = "product_id_seq")
private Long id;
private String name;
private String cost;

}
