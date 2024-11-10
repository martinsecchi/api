package com.secchi.rest.persistence;

import com.secchi.rest.entities.Maker;
import com.secchi.rest.repository.MakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MakerDaoImpl implements MakerDao {

    @Autowired
    private MakerRepository makerRepository;

    @Override
    public Optional<Maker> findById(Long id) {
        return makerRepository.findById(id);
    }

    @Override
    public List<Maker> findAll() {
        return (List<Maker>) makerRepository.findAll();
    }

    @Override
    public void save(Maker m) {
        makerRepository.save(m);
    }

    @Override
    public void deleteById(Long id) {
        makerRepository.deleteById(id);
    }
}
