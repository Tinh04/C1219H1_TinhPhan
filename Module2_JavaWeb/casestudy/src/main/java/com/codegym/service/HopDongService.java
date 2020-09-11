package com.codegym.service;

import com.codegym.entity.HopDong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface HopDongService {

    Page<HopDong> findAll(Pageable pageable);

    HopDong findById(Integer id);

    void save(HopDong hopDong);

    void remove(Integer id);
}
