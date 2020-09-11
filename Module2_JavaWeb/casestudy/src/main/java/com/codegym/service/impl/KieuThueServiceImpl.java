package com.codegym.service.impl;

import com.codegym.entity.KieuThue;
import com.codegym.repository.KieuThueRepository;
import com.codegym.service.KieuThueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KieuThueServiceImpl implements KieuThueService {

    @Autowired
    private KieuThueRepository kieuThueRepository;


    @Override
    public List<KieuThue> findAll() {
        return kieuThueRepository.findAll();
    }

    @Override
    public KieuThue findById(Integer id) {
        return kieuThueRepository.findById(id).orElse(null);
    }

    @Override
    public void save(KieuThue kieuThue) {
        kieuThueRepository.save(kieuThue);
    }

    @Override
    public void remove(Integer id) {
        kieuThueRepository.deleteById(id);
    }
}
