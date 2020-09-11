package com.codegym.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import java.sql.Date;
import java.util.List;

@Entity
@Table(name = "nhan_vien")
public class NhanVien implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_nhan_vien")
    private Integer idNhanVien;

    @Column(name = "ten_nhan_vien")
    private String tenNhanVien;

    @Column(name = "ngay_sinh_nhan_vien")
    private Date ngaySinhNhanVien;

    @Column(name = "cmnd_nhan_vien")
    private String cmndNhanVien;

    @Column(name = "luong")
    @Min(value = 0)
    private Double luong;

    @Column(name = "sdt_nhan_vien")
    private String sdtNhanVien;

    @Column(name = "mail_nhan_vien")
    @Pattern(regexp = "^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$",
            message = "Email Bat Dau Bang Chu Va Khong chua Ky Tu Dac Biet.")
    private String mailNhanVien;

    @Column(name = "dia_chi_nhan_vien")
    private String diaChiNhanVien;

    @ManyToOne()
    @JoinColumn(name = "trinh_do_id")
    private TrinhDo trinhDo;

    @ManyToOne()
    @JoinColumn(name = "vi_tri_id")
    private ViTri viTri;

    @ManyToOne()
    @JoinColumn(name = "bo_phan_id")
    private BoPhan boPhan;

    @OneToMany(mappedBy = "nhanVien")
    private List<HopDong> hopDongList;

    public NhanVien() {
    }

    public NhanVien(String tenNhanVien, Date ngaySinhNhanVien, String cmndNhanVien, Double luong, String sdtNhanVien,
                    String mailNhanVien, String diaChiNhanVien) {
        this.tenNhanVien = tenNhanVien;
        this.ngaySinhNhanVien = ngaySinhNhanVien;
        this.cmndNhanVien = cmndNhanVien;
        this.luong = luong;
        this.sdtNhanVien = sdtNhanVien;
        this.mailNhanVien = mailNhanVien;
        this.diaChiNhanVien = diaChiNhanVien;
    }

    public Integer getIdNhanVien() {
        return idNhanVien;
    }

    public void setIdNhanVien(Integer idNhanVien) {
        this.idNhanVien = idNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public Date getNgaySinhNhanVien() {
        return ngaySinhNhanVien;
    }

    public void setNgaySinhNhanVien(Date ngaySinhNhanVien) {
        this.ngaySinhNhanVien = ngaySinhNhanVien;
    }

    public String getCmndNhanVien() {
        return cmndNhanVien;
    }

    public void setCmndNhanVien(String cmndNhanVien) {
        this.cmndNhanVien = cmndNhanVien;
    }

    public Double getLuong() {
        return luong;
    }

    public void setLuong(Double luong) {
        this.luong = luong;
    }

    public String getSdtNhanVien() {
        return sdtNhanVien;
    }

    public void setSdtNhanVien(String sdtNhanVien) {
        this.sdtNhanVien = sdtNhanVien;
    }

    public String getMailNhanVien() {
        return mailNhanVien;
    }

    public void setMailNhanVien(String mailNhanVien) {
        this.mailNhanVien = mailNhanVien;
    }

    public String getDiaChiNhanVien() {
        return diaChiNhanVien;
    }

    public void setDiaChiNhanVien(String diaChiNhanVien) {
        this.diaChiNhanVien = diaChiNhanVien;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return NhanVien.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        NhanVien nhanVien = (NhanVien) target;

        String cmndNV = nhanVien.getCmndNhanVien();
        if(!(cmndNV.matches("^((\\d{9})|(\\d{12}))$"))){
            errors.rejectValue("cmndNV","cmndNV.matches");
        }

        String sdtNV = nhanVien.getSdtNhanVien();
        if (!(sdtNV.matches("((^|, )(090|091|\\(84\\)\\+|\\(84\\)\\+))+[0-9]{7}$"))) {
            errors.rejectValue("sdtNV", "sdtNV.matches");
        }
    }
}
