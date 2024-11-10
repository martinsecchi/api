package com.secchi.rest.controller.dto;

import com.secchi.rest.entities.Product;

import java.util.List;


public class MakerDTO {

    private Long id;
    private String name;
    private List<ProductDTO> productList;


    public MakerDTO(Long id) {
        this.id = id;
    }

    public MakerDTO(Long id, String name, List<ProductDTO> productList) {
        this.id = id;
        this.productList = productList;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<ProductDTO> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductDTO> productList) {
        this.productList = productList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
