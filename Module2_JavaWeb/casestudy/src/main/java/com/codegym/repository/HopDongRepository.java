package com.codegym.repository;

import com.codegym.entity.HopDong;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HopDongRepository extends JpaRepository<HopDong, Integer> {

}
