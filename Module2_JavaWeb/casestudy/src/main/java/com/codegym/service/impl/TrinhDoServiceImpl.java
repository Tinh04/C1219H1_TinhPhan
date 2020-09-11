package com.codegym.service.impl;

import com.codegym.entity.TrinhDo;
import com.codegym.repository.TrinhDoRepository;
import com.codegym.service.TrinhDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrinhDoServiceImpl implements TrinhDoService {

    @Autowired
    private TrinhDoRepository trinhDoRepository;


    @Override
    public List<TrinhDo> findAll() {
        return trinhDoRepository.findAll();
    }

    @Override
    public TrinhDo findById(Integer id) {
        return trinhDoRepository.findById(id).orElse(null);
    }

    @Override
    public void save(TrinhDo trinhDo) {
        trinhDoRepository.save(trinhDo);
    }

    @Override
    public void remove(Integer id) {
        trinhDoRepository.deleteById(id);
    }
}
