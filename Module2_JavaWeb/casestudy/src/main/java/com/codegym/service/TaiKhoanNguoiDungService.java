package com.codegym.service;

import com.codegym.entity.TaiKhoanNguoiDung;

import java.util.List;

public interface TaiKhoanNguoiDungService {

    List<TaiKhoanNguoiDung> findAll();

    TaiKhoanNguoiDung findById(Integer id);

    void save(TaiKhoanNguoiDung taiKhoanNguoiDung);

    void remove(Integer id);
}
