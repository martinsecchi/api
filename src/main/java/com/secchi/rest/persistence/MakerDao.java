package com.secchi.rest.persistence;

import com.secchi.rest.entities.Maker;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;


public interface MakerDao {

    Optional<Maker> findById(Long id);

    List<Maker> findAll();

    void save(Maker m);

    void deleteById(Long id);


}
