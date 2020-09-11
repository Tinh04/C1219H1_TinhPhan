package com.codegym.service;

import com.codegym.entity.DichVuDiKem;

import java.util.List;

public interface DichVuDiKemService {

    List<DichVuDiKem> findAll();

    DichVuDiKem findById(Integer id);

    void save(DichVuDiKem dichVuDiKem);

    void remove(Integer id);
}
