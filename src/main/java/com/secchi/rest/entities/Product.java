package com.secchi.rest.entities;

import jakarta.persistence.*;
import java.math.BigDecimal;


@Entity
@Cacheable(true)
@Table(name = "producto")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private BigDecimal price;
    @ManyToOne
    @JoinColumn(name = "id_fabricante")
    private Maker maker;


    public Product() {
    }

    public Product(Long id, BigDecimal price, Maker maker, String name) {
        this.id = id;
        this.price = price;
        this.maker = maker;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
