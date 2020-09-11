package com.codegym.repository;

import com.codegym.entity.KhachHang;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.Pattern;
import java.util.List;

public interface KhachHangRepository extends JpaRepository<KhachHang, String> {

    Page<KhachHang> findAllByTenKhachHangContaining(String tenKhachHang, Pageable pageable);

    Page<KhachHang> findAllByDiaChiKhachHangContainingOrNgaySinhKhachHangContainingOrTenKhachHangContainingOrSdtKhachHangContainingOrCmndKhachHangContainingOrMailKhachHangContainingOrIdKhachHang
            (String diaChiKhachHang, String ngaySinhKhachHang, String tenKhachhang, String sdtKhachhang,
             String cmndKhachHang, String mailKhachHang, String idKhachHang, Pageable pageable);
}
