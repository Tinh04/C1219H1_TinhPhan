package com.codegym.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "loai_khach")

public class LoaiKhach {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_loai_khach")
    private Integer idLoaiKhach;

    @Column(name = "ten_loai_khach")
    private String tenLoaiKhach;

    @OneToMany(mappedBy = "loaiKhach")
    private List<KhachHang> khachHang;

    public LoaiKhach() {
    }

    public LoaiKhach(String tenLoaiKhach) {
        this.tenLoaiKhach = tenLoaiKhach;
    }

    public Integer getIdLoaiKhach() {
        return idLoaiKhach;
    }

    public void setIdLoaiKhach(Integer idLoaiKhach) {
        this.idLoaiKhach = idLoaiKhach;
    }

    public String getTenLoaiKhach() {
        return tenLoaiKhach;
    }

    public void setTenLoaiKhach(String tenLoaiKhach) {
        this.tenLoaiKhach = tenLoaiKhach;
    }
}
