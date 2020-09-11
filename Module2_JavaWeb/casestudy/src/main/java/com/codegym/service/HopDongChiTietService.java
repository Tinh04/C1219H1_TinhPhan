package com.codegym.service;

import com.codegym.entity.HopDongChiTiet;

import java.util.List;

public interface HopDongChiTietService {

    List<HopDongChiTiet> findAll();

    HopDongChiTiet findById(Integer id);

    void save(HopDongChiTiet hopDongChiTiet);

    void remove(Integer id);
}
