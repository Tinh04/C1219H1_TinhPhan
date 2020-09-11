package com.codegym.service;

import com.codegym.entity.DichVu;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface DichVuService {

    Page<DichVu> findAll(Pageable pageable);

    List<DichVu> findAll();

    DichVu findById(String id);

    void save(DichVu category);

    void remove(String id);
}
