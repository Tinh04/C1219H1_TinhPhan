package com.codegym.service.impl;

import com.codegym.entity.TaiKhoanNguoiDung;
import com.codegym.repository.TaiKhoanNguoiDungRepository;
import com.codegym.service.TaiKhoanNguoiDungService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaiKhoanNguoiDungServiceImpl implements TaiKhoanNguoiDungService {

    @Autowired
    private TaiKhoanNguoiDungRepository taiKhoanNguoiDungRepository;


    @Override
    public List<TaiKhoanNguoiDung> findAll() {
        return taiKhoanNguoiDungRepository.findAll();
    }

    @Override
    public TaiKhoanNguoiDung findById(Integer id) {
        return taiKhoanNguoiDungRepository.findById(id).orElse(null);
    }

    @Override
    public void save(TaiKhoanNguoiDung taiKhoanNguoiDung) {
        taiKhoanNguoiDungRepository.save(taiKhoanNguoiDung);
    }

    @Override
    public void remove(Integer id) {
        taiKhoanNguoiDungRepository.deleteById(id);
    }
}
