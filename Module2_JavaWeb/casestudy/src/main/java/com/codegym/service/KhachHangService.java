package com.codegym.service;

import com.codegym.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface KhachHangService {

    Page<KhachHang> findAll(Pageable pageable);

    List<KhachHang> findAll();

    KhachHang findById(String id);

    void save(KhachHang khachHang);

    void remove(String id);

    Page<KhachHang> findAllByTenKhachHangContaining(String tenKhachHang, Pageable pageable);

    Page<KhachHang> findAllByDiaChiKhachHangContainingOrNgaySinhKhachHangContainingOrTenKhachHangContainingOrSdtKhachHangContainingOrCmndKhachHangContainingOrMailKhachHangContainingOrIdKhachHang
            (String keyword, Pageable pageable);
}
