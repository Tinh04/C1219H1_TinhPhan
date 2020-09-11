package com.codegym.service;

import com.codegym.entity.LoaiKhach;

import java.util.List;

public interface LoaiKhachService {

    List<LoaiKhach> findAll();

    LoaiKhach findById(Integer id);

    void save(LoaiKhach loaiKhach);

    void remove(Integer id);
}
