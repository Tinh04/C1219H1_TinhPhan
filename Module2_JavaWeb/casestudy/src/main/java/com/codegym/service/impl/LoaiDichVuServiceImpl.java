package com.codegym.service.impl;

import com.codegym.entity.LoaiDichVu;
import com.codegym.repository.LoaiDichVuRepository;
import com.codegym.service.LoaiDichVuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoaiDichVuServiceImpl implements LoaiDichVuService {

    @Autowired
    private LoaiDichVuRepository loaiDichVuRepository;


    @Override
    public List<LoaiDichVu> findAll() {
        return loaiDichVuRepository.findAll();
    }

    @Override
    public LoaiDichVu findById(Integer id) {
        return loaiDichVuRepository.findById(id).orElse(null);
    }

    @Override
    public void save(LoaiDichVu loaiDichVu) {
        loaiDichVuRepository.save(loaiDichVu);
    }

    @Override
    public void remove(Integer id) {
        loaiDichVuRepository.deleteById(id);
    }
}
