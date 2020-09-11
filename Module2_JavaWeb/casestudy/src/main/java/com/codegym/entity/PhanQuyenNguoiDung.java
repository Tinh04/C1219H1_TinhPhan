package com.codegym.entity;

import javax.persistence.*;

@Entity
@Table(name = "vi_tri_nguoi_dung")
public class PhanQuyenNguoiDung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPhanQuyenNguoiDung;

    @Column(name = "quyen_nguoi_dung")
    private String quyenNguoiDung;

    @OneToOne(mappedBy = "phanQuyenNguoiDung")
    private TaiKhoanNguoiDung taiKhoanNguoiDung;

    public PhanQuyenNguoiDung() {
    }

    public Integer getIdPhanQuyenNguoiDung() {
        return idPhanQuyenNguoiDung;
    }

    public void setIdPhanQuyenNguoiDung(Integer idPhanQuyenNguoiDung) {
        this.idPhanQuyenNguoiDung = idPhanQuyenNguoiDung;
    }

    public String getQuyenNguoiDung() {
        return quyenNguoiDung;
    }

    public void setQuyenNguoiDung(String quyenNguoiDung) {
        this.quyenNguoiDung = quyenNguoiDung;
    }
}
