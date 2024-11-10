package com.secchi.rest.controller.dto;

import java.math.BigDecimal;


public class ProductDTO {

    public ProductDTO(MakerDTO maker, BigDecimal price, String name, Long id) {
        this.maker = maker;
        this.price = price;
        this.name = name;
        this.id = id;
    }

    public ProductDTO() {
    }

    private Long id;
    private String name;
    private BigDecimal price;
    private MakerDTO maker;

    public MakerDTO getMaker() {
        return maker;
    }

    public void setMaker(MakerDTO maker) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
