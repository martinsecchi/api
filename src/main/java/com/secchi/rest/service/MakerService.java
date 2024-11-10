package com.secchi.rest.service;

import com.secchi.rest.controller.dto.MakerDTO;
import com.secchi.rest.entities.Maker;

import java.util.List;
import java.util.Optional;

public interface MakerService {
    Optional<Maker> findById(Long id);

    List<Maker> findAll();

    void save(Maker m);

    void deleteById(Long id);

}
