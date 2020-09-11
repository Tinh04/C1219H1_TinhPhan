package com.codegym.service;

import com.codegym.entity.LoaiDichVu;

import java.util.List;

public interface LoaiDichVuService {

    List<LoaiDichVu> findAll();

    LoaiDichVu findById(Integer id);

    void save(LoaiDichVu loaiDichVu);

    void remove(Integer id);
}
