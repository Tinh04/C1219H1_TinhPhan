package com.codegym.service.impl;

import com.codegym.entity.ViTri;
import com.codegym.repository.ViTriRepository;
import com.codegym.service.ViTriService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ViTriServiceImpl implements ViTriService {

    @Autowired
    private ViTriRepository viTriRepository;


    @Override
    public List<ViTri> findAll() {
        return viTriRepository.findAll();
    }

    @Override
    public ViTri findById(Integer id) {
        return viTriRepository.findById(id).orElse(null);
    }

    @Override
    public void save(ViTri viTri) {
        viTriRepository.save(viTri);
    }

    @Override
    public void remove(Integer id) {
        viTriRepository.deleteById(id);
    }
}
