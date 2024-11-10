package com.secchi.rest.persistence;

import com.secchi.rest.entities.Product;
import com.secchi.rest.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Component
public class ProductDaoImpl implements ProductDao {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<Product> findByMakerId(Long id) {
        return productRepository.findByMakerId(id);
    }

    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productRepository.findByPriceInRange(minPrice, maxPrice);
    }

    @Override
    public void save(Product m) {
        productRepository.save(m);
    }

    @Override
    public void deleteById(Long id) {
        productRepository.deleteById(id);
    }


}
