package com.codegym.service.impl;

import com.codegym.entity.KhachHang;
import com.codegym.repository.KhachHangRepository;
import com.codegym.service.KhachHangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KhachHangServiceImpl implements KhachHangService {

    @Autowired
    private KhachHangRepository khachHangRepository;


    @Override
    public Page<KhachHang> findAll(Pageable pageable) {
        return khachHangRepository.findAll(pageable);
    }

    @Override
    public List<KhachHang> findAll() {
        return khachHangRepository.findAll();
    }

    @Override
    public KhachHang findById(String id) {
        return khachHangRepository.findById(id).orElse(null);
    }

    @Override
    public void save(KhachHang khachHang) {
        khachHangRepository.save(khachHang);
    }

    @Override
    public void remove(String id) {
        khachHangRepository.deleteById(id);
    }

    @Override
    public Page<KhachHang> findAllByTenKhachHangContaining(String tenKhachHang, Pageable pageable) {
        return khachHangRepository.findAllByTenKhachHangContaining(tenKhachHang, pageable);
    }

    @Override
    public Page<KhachHang> findAllByDiaChiKhachHangContainingOrNgaySinhKhachHangContainingOrTenKhachHangContainingOrSdtKhachHangContainingOrCmndKhachHangContainingOrMailKhachHangContainingOrIdKhachHang(String keyword,Pageable pageable) {
        return khachHangRepository.findAllByDiaChiKhachHangContainingOrNgaySinhKhachHangContainingOrTenKhachHangContainingOrSdtKhachHangContainingOrCmndKhachHangContainingOrMailKhachHangContainingOrIdKhachHang
                (keyword, keyword, keyword, keyword, keyword, keyword, keyword, pageable);
    }

}
