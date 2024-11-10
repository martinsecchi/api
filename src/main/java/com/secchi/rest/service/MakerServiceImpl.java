package com.secchi.rest.service;

import com.secchi.rest.entities.Maker;
import com.secchi.rest.persistence.MakerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MakerServiceImpl implements MakerService {


    @Autowired
    private MakerDao makerDao;

    @Override
    public Optional<Maker> findById(Long id) {
        return makerDao.findById(id);
    }

    @Override
    public List<Maker> findAll() {
        return makerDao.findAll();
    }

    @Override
    public void save(Maker m) {
        makerDao.save(m);
    }

    @Override
    public void deleteById(Long id) {
        makerDao.deleteById(id);
    }
}
