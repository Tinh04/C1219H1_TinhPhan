package com.codegym.service.impl;

import com.codegym.entity.BoPhan;
import com.codegym.entity.DichVuDiKem;
import com.codegym.repository.DichVuDiKemRepository;
import com.codegym.service.DichVuDiKemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DichVuDiKemServiceImpl implements DichVuDiKemService {

    @Autowired
    private DichVuDiKemRepository dichVuDiKemRepository;


    @Override
    public List<DichVuDiKem> findAll() {
        return dichVuDiKemRepository.findAll();
    }

    @Override
    public DichVuDiKem findById(Integer id) {
        return dichVuDiKemRepository.findById(id).orElse(null);
    }

    @Override
    public void save(DichVuDiKem dichVuDiKem) {
        dichVuDiKemRepository.save(dichVuDiKem);
    }

    @Override
    public void remove(Integer id) {
        dichVuDiKemRepository.deleteById(id);
    }
}
