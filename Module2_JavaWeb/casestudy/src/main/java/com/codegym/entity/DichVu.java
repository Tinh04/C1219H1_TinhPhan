package com.codegym.entity;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.List;

@Entity
@Table(name = "dich_vu")
public class DichVu  implements Validator {

    @Id
    @Column(name = "id_dich_vu")
//    @Pattern(regexp = "^DV[0-9]{4}$", message = "Ma Dich vu Khong Hop Le (Dinh Dang: DV[XXXX] (X: 0-9)")
//    @NotNull(message = "Ma Dich Vu Khong Duoc De Trong")
    private String idDichVu;

    @Column(name = "ten_dich_vu")
    @NotNull(message = "Ten Dich Vu Khong Duoc De Trong")
    private String tenDichVu;

    @Column(name = "dien_tich")
    @Min(value = 0,message = "Dien Tich La So Nguyen Duong")
    private Float dienTich;

    @Column(name = "so_tang")
    @Min(value = 0,message = "So Tang La So Nguyen Duong")
    private Integer soTang;

    @Column(name = "so_nguoi_toi_da")
    @Min(value = 0,message = "So Nguoi Toi Da La So Nguyen Duong")
    private Integer soNguoiToiDa;

    @Column(name = "chi_phi_thue")
    @Min(value = 0,message = "Chi Phi Thue La So Nguyen Duong")
    private Double chiPhiThue;

    @Column(name = "trang_thai_dich_vu")
    @NotNull(message = "Trang Thai Dich Vu Khong Duoc De Trong")
    private String trangThaiDichVu;

    @ManyToOne()
    @JoinColumn(name = "kieu_thue_id")
    private KieuThue kieuThue;

    @ManyToOne()
    @JoinColumn(name = "loai_dich_vu_id")
    private LoaiDichVu loaiDichVu;

    @OneToMany(mappedBy = "dichVu")
    private List<HopDong> hopDongList;

    public DichVu() {
    }

    public DichVu(String tenDichVu, Float dienTich, Integer soTang, Integer soNguoiToiDa, Double chiPhiThue,
                  String trangThaiDichVu) {
        this.tenDichVu = tenDichVu;
        this.dienTich = dienTich;
        this.soTang = soTang;
        this.soNguoiToiDa = soNguoiToiDa;
        this.chiPhiThue = chiPhiThue;
        this.trangThaiDichVu = trangThaiDichVu;
    }

    public String getIdDichVu() {
        return idDichVu;
    }

    public void setIdDichVu(String idDichVu) {
        this.idDichVu = idDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public Float getDienTich() {
        return dienTich;
    }

    public void setDienTich(Float dienTich) {
        this.dienTich = dienTich;
    }

    public Integer getSoTang() {
        return soTang;
    }

    public void setSoTang(Integer soTang) {
        this.soTang = soTang;
    }

    public Integer getSoNguoiToiDa() {
        return soNguoiToiDa;
    }

    public void setSoNguoiToiDa(Integer soNguoiToiDa) {
        this.soNguoiToiDa = soNguoiToiDa;
    }

    public Double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(Double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String getTrangThaiDichVu() {
        return trangThaiDichVu;
    }

    public void setTrangThaiDichVu(String trangThaiDichVu) {
        this.trangThaiDichVu = trangThaiDichVu;
    }

    public KieuThue getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(KieuThue kieuThue) {
        this.kieuThue = kieuThue;
    }

    public LoaiDichVu getLoaiDichVu() {
        return loaiDichVu;
    }

    public void setLoaiDichVu(LoaiDichVu loaiDichVu) {
        this.loaiDichVu = loaiDichVu;
    }

    public List<HopDong> getHopDongList() {
        return hopDongList;
    }

    public void setHopDongList(List<HopDong> hopDongList) {
        this.hopDongList = hopDongList;
    }


    @Override
    public boolean supports(Class<?> clazz) {
        return DichVu.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        DichVu dichVu = (DichVu) target;

        String idDV = dichVu.getIdDichVu();
        if ((!idDV.matches("^(DV-)[0-9]{4}$"))){
            errors.rejectValue("idDV","idDV.matches");
        }
    }
}
