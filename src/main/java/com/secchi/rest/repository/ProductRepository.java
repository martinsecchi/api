package com.secchi.rest.repository;

import com.secchi.rest.entities.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Long> {

    @Query("select p from Product p where p.price >= ?1 and p.price <= ?2 ")
    List<Product> findByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice);

    @Query("select p from Product p  where p.maker.id = ?1")
    List<Product> findByMakerId(Long id);

}
