package com.codegym.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "khach_hang")
public class KhachHang implements Validator {

    @Id
    @Column(name = "id_khach_hang")
//    @Pattern(regexp = "^KH[0-9]{4}$", message = "Ma Khach Hang Khong Hop Le (Dinh Dang: KH[XXXX] (X: 0-9)")
    private String idKhachHang;

    @Column(name = "ten_khach_hang")
    private String tenKhachHang;

    @Column(name = "ngay_sinh_khach_hang")
    private String ngaySinhKhachHang;

    @Column(name = "gioi_tinh_khach_hang")
    private String gioiTinhKhachHang;

    @Column(name = "cmnd_khach_hang")
//    @Pattern(regexp = "^((\\d{9})|(\\d{12}))$", message = "So CMND Khong Dung Dinh Dang")
    private String cmndKhachHang;

    @Column(name = "sdt_khach_hang")
    private String sdtKhachHang;

    @Column(name = "mail_khach_hang")
    @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$",
            message = "Email Bat Dau Bang Chu Va Khong chua Ky Tu Dac Biet.")
    private String mailKhachHang;

    @Column(name = "dia_chi_khach_hang")
//    @NotNull(message = "Dia Chi Khach Hang Khong Duoc De Trong")
    private String diaChiKhachHang;

    @ManyToOne()
    @JoinColumn(name = "loai_khach_id")
    private LoaiKhach loaiKhach;

    @OneToOne()
    @JoinColumn(name = "tai_khoan_nguoi_dung_id")
    private TaiKhoanNguoiDung taiKhoanNguoiDung;

    @OneToMany(mappedBy = "khachHang")
    private List<HopDong> hopDongList;

    public KhachHang() {
    }

    public KhachHang(String idKhachHang, String tenKhachHang, String ngaySinhKhachHang, String cmndKhachHang, String sdtKhachHang,
                     String mailKhachHang, String diaChiKhachHang) {
        this.idKhachHang = idKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.ngaySinhKhachHang = ngaySinhKhachHang;
        this.cmndKhachHang = cmndKhachHang;
        this.sdtKhachHang = sdtKhachHang;
        this.mailKhachHang = mailKhachHang;
        this.diaChiKhachHang = diaChiKhachHang;
    }

    public String getIdKhachHang() {
        return idKhachHang;
    }

    public void setIdKhachHang(String idKhachHang) {
        this.idKhachHang = idKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public String getNgaySinhKhachHang() {
        return ngaySinhKhachHang;
    }

    public void setNgaySinhKhachHang(String ngaySinhKhachHang) {
        this.ngaySinhKhachHang = ngaySinhKhachHang;
    }

    public String getGioiTinhKhachHang() {
        return gioiTinhKhachHang;
    }

    public void setGioiTinhKhachHang(String gioiTinhKhachHang) {
        this.gioiTinhKhachHang = gioiTinhKhachHang;
    }

    public String getCmndKhachHang() {
        return cmndKhachHang;
    }

    public void setCmndKhachHang(String cmndKhachHang) {
        this.cmndKhachHang = cmndKhachHang;
    }

    public String getSdtKhachHang() {
        return sdtKhachHang;
    }

    public void setSdtKhachHang(String sdtKhachHang) {
        this.sdtKhachHang = sdtKhachHang;
    }

    public String getMailKhachHang() {
        return mailKhachHang;
    }

    public void setMailKhachHang(String mailKhachHang) {
        this.mailKhachHang = mailKhachHang;
    }

    public String getDiaChiKhachHang() {
        return diaChiKhachHang;
    }

    public void setDiaChiKhachHang(String diaChiKhachHang) {
        this.diaChiKhachHang = diaChiKhachHang;
    }

    public LoaiKhach getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(LoaiKhach loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public TaiKhoanNguoiDung getTaiKhoanNguoiDung() {
        return taiKhoanNguoiDung;
    }

    public void setTaiKhoanNguoiDung(TaiKhoanNguoiDung taiKhoanNguoiDung) {
        this.taiKhoanNguoiDung = taiKhoanNguoiDung;
    }

    public List<HopDong> getHopDongList() {
        return hopDongList;
    }

    public void setHopDongList(List<HopDong> hopDongList) {
        this.hopDongList = hopDongList;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return KhachHang.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        KhachHang khachHang = (KhachHang) target;

        String idKH = khachHang.getIdKhachHang();
        if (!(idKH.matches("^(KH-)[0-9]{4}$"))){
            errors.rejectValue("idKH", "idKH.matches");
        }

        String cmndKH = khachHang.getCmndKhachHang();
        if(!(cmndKH.matches("^((\\d{9})|(\\d{12}))$"))){
            errors.rejectValue("cmndKH","cmndKH.matches");
        }

        String sdtKH = khachHang.getSdtKhachHang();
        if (!(sdtKH.matches("((^|, )(090|091|\\(84\\)\\+|\\(84\\)\\+))+[0-9]{7}$"))) {
            errors.rejectValue("sdtKH", "sdtKH.matches");
        }
    }
}
