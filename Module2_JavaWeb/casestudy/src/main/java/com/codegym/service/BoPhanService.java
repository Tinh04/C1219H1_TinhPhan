package com.codegym.service;

import com.codegym.entity.BoPhan;

import java.util.List;

public interface BoPhanService {

    List<BoPhan> findAll();

    BoPhan findById(Integer id);

    void save(BoPhan boPhan);

    void remove(Integer id);
}
