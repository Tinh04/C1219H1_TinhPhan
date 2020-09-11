package com.codegym.service;

import com.codegym.entity.ViTri;

import java.util.List;

public interface ViTriService {

    List<ViTri> findAll();

    ViTri findById(Integer id);

    void save(ViTri viTri);

    void remove(Integer id);
}
