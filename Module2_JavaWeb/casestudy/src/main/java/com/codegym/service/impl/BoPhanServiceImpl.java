package com.codegym.service.impl;

import com.codegym.entity.BoPhan;
import com.codegym.repository.BoPhanRepository;
import com.codegym.service.BoPhanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoPhanServiceImpl implements BoPhanService {

    @Autowired
    private BoPhanRepository boPhanRepository;


    @Override
    public List<BoPhan> findAll() {
        return boPhanRepository.findAll();
    }

    @Override
    public BoPhan findById(Integer id) {
        return boPhanRepository.findById(id).orElse(null);
    }

    @Override
    public void save(BoPhan boPhan) {
        boPhanRepository.save(boPhan);
    }

    @Override
    public void remove(Integer id) {
        boPhanRepository.deleteById(id);
    }
}
