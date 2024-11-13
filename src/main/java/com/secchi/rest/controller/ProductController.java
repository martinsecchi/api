package com.secchi.rest.controller;

import com.secchi.rest.controller.dto.ProductDTO;
import com.secchi.rest.service.ProductService;
import com.secchi.rest.util.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/{id}")
    public ResponseEntity<ProductDTO> findProductById(@PathVariable Long id) {
        return productService.findById(id).map(product ->
                        ResponseEntity.ok(ProductMapper.toDTO.apply(product))).
                orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/")
    public ResponseEntity<List<ProductDTO>> findProduct() {
        return ResponseEntity.ofNullable(productService.findAll().stream().map(ProductMapper.toDTO).toList());
    }

    @GetMapping("/makers/{id}")
    public ResponseEntity<List<ProductDTO>> findProductByMarker(@PathVariable Long id) {
        return ResponseEntity.ofNullable(productService.findByMakerId(id).stream().map(ProductMapper.toDTO).toList());
    };


}
