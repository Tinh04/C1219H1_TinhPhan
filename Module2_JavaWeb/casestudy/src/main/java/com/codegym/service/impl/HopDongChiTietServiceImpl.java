package com.codegym.service.impl;

import com.codegym.entity.HopDongChiTiet;
import com.codegym.repository.HopDongChiTietRepository;
import com.codegym.service.HopDongChiTietService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HopDongChiTietServiceImpl implements HopDongChiTietService {

    @Autowired
    private HopDongChiTietRepository hopDongChiTietRepository;


    @Override
    public List<HopDongChiTiet> findAll() {
        return hopDongChiTietRepository.findAll();
    }

    @Override
    public HopDongChiTiet findById(Integer id) {
        return hopDongChiTietRepository.findById(id).orElse(null);
    }

    @Override
    public void save(HopDongChiTiet hopDongChiTiet) {
        hopDongChiTietRepository.save(hopDongChiTiet);
    }

    @Override
    public void remove(Integer id) {
        hopDongChiTietRepository.deleteById(id);
    }
}
