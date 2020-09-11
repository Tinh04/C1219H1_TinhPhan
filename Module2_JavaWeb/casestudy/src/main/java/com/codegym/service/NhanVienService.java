package com.codegym.service;

import com.codegym.entity.NhanVien;

import java.util.List;

public interface NhanVienService {

    List<NhanVien> findAll();

     NhanVien findById(Integer id);

    void save(NhanVien nhanVien);

    void remove(Integer id);
}
