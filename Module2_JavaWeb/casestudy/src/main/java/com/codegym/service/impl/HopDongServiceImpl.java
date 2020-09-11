package com.codegym.service.impl;

import com.codegym.entity.HopDong;
import com.codegym.repository.HopDongRepository;
import com.codegym.service.HopDongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HopDongServiceImpl implements HopDongService {

    @Autowired
    private HopDongRepository hopDongRepository;

    @Override
    public Page<HopDong> findAll(Pageable pageable) {
        return hopDongRepository.findAll(pageable);
    }

    @Override
    public HopDong findById(Integer id) {
        return hopDongRepository.findById(id).orElse(null);
    }

    @Override
    public void save(HopDong hopDong) {
        hopDongRepository.save(hopDong);
    }

    @Override
    public void remove(Integer id) {
        hopDongRepository.deleteById(id);
    }

}
