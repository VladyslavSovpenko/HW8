package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producer")
public class Producer {
    @Id
    @GeneratedValue(generator = "producer_id_seq")
    private Long id;
    private String name;
}
