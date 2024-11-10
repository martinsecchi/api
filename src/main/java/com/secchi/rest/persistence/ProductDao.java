package com.secchi.rest.persistence;

import com.secchi.rest.entities.Product;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface ProductDao {

    Optional<Product> findById(Long id);

    List<Product> findByMakerId(Long id);

    List<Product> findAll();

    public List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

    void save(Product m);

    void deleteById(Long id);

}
