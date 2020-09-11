package com.codegym.service;

import com.codegym.entity.KieuThue;

import java.util.List;

public interface KieuThueService {

    List<KieuThue> findAll();

    KieuThue findById(Integer id);

    void save(KieuThue kieuThue);

    void remove(Integer id);
}
