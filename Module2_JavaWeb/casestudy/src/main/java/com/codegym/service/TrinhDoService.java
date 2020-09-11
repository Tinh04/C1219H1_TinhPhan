package com.codegym.service;

import com.codegym.entity.TrinhDo;

import java.util.List;

public interface TrinhDoService {

    List<TrinhDo> findAll();

    TrinhDo findById(Integer id);

    void save(TrinhDo trinhDo);

    void remove(Integer id);
}
