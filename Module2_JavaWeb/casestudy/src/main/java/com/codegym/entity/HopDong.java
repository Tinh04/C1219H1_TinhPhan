package com.codegym.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "hop_dong")
public class HopDong implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hop_dong")
    private Integer idHopDong;

    @Column(name = "ngay_lam_hop_dong")
    private String ngayLamHopDong;

    @Column(name = "ngay_ket_thuc_hop_dong")
    private String ngayKetThucHopDong;

    @Column(name = "tien_coc")
    @Min(value = 0,message = "Tien Coc La So Nguyen Duong")
    private Double tienCoc;

    @Column(name = "tong_tien")
    @Min(value = 0,message = "Tong Tien La So Nguyen Duong")
    private Double tongTien;

    @ManyToOne()
    @JoinColumn(name = "khach_hang_id")
    private KhachHang khachHang;

    @ManyToOne()
    @JoinColumn(name = "dich_vu_id")
    private DichVu dichVu;

    @ManyToOne()
    @JoinColumn(name = "nhan_vien_id")
    private NhanVien nhanVien;

    @OneToMany(mappedBy = "hopDong", cascade = CascadeType.ALL)
    private List<HopDongChiTiet> hopDongChiTietList;

    public HopDong() {
    }

    public HopDong(String ngayLamHopDong, String ngayKetThucHopDong, Double tienCoc, Double tongTien) {
        this.ngayLamHopDong = ngayLamHopDong;
        this.ngayKetThucHopDong = ngayKetThucHopDong;
        this.tienCoc = tienCoc;
        this.tongTien = tongTien;
    }


    public Integer getIdHopDong() {
        return idHopDong;
    }

    public void setIdHopDong(Integer idHopDong) {
        this.idHopDong = idHopDong;
    }

    public String getNgayLamHopDong() {
        return ngayLamHopDong;
    }

    public void setNgayLamHopDong(String ngayLamHopDong) {
        this.ngayLamHopDong = ngayLamHopDong;
    }

    public String getNgayKetThucHopDong() {
        return ngayKetThucHopDong;
    }

    public void setNgayKetThucHopDong(String ngayKetThucHopDong) {
        this.ngayKetThucHopDong = ngayKetThucHopDong;
    }

    public Double getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(Double tienCoc) {
        this.tienCoc = tienCoc;
    }

    public Double getTongTien() {
        return tongTien;
    }

    public void setTongTien(Double tongTien) {
        this.tongTien = tongTien;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        this.dichVu = dichVu;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public List<HopDongChiTiet> getHopDongChiTietList() {
        return hopDongChiTietList;
    }

    public void setHopDongChiTietList(List<HopDongChiTiet> hopDongChiTietList) {
        this.hopDongChiTietList = hopDongChiTietList;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return HopDong.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {

    }
}
