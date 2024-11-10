package com.secchi.rest.service;

import com.secchi.rest.entities.Product;
import com.secchi.rest.persistence.ProductDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    @Override
    public Optional<Product> findById(Long id) {
        return productDao.findById(id);
    }

    @Override
    public List<Product> findByMakerId(Long id) {
        return productDao.findByMakerId(id);
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productDao.findByPriceInRange(minPrice, maxPrice);
    }

    @Override
    public void save(Product m) {
        productDao.save(m);
    }

    @Override
    public void deleteById(Long id) {
        productDao.deleteById(id);
    }
}
