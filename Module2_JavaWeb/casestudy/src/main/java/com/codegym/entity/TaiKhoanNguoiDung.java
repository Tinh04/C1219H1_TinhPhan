package com.codegym.entity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "tai_khoan_nguoi_dung")
public class TaiKhoanNguoiDung {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nguoi_dung")
    private Integer idNguoiDung;

    @Column(name = "ten_nguoi_dung")
    @NotNull
    private String tenNguoiDung;

    @Column(name = "mat_khau")
    @NotNull
    private String matKhau;

    @OneToOne()
    @JoinColumn(name = "phan_quyen_nguoi_dung_id")
    private PhanQuyenNguoiDung phanQuyenNguoiDung;

    @OneToOne(mappedBy = "taiKhoanNguoiDung")
    private KhachHang khachHang;

    public TaiKhoanNguoiDung() {
    }

    public Integer getIdNguoiDung() {
        return idNguoiDung;
    }

    public void setIdNguoiDung(Integer idNguoiDung) {
        this.idNguoiDung = idNguoiDung;
    }

    public String getTenNguoiDung() {
        return tenNguoiDung;
    }

    public void setTenNguoiDung(String tenNguoiDung) {
        this.tenNguoiDung = tenNguoiDung;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }
}
