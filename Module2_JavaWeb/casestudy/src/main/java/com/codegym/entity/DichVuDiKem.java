package com.codegym.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "dich_vu_di_kem")
public class DichVuDiKem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_dich_vu_di_kem")
    private Integer idDichVuDiKem;

    @Column(name = "ten_dich_vu_di_kem")
//    @NotNull(message = "Ten Dich Vu Khong Duoc De Trong")
    private String tenDichVuDiKem;

    @Column(name = "gia_dich_vu_di_kem")
    @Min(value = 0)
//    @NotNull(message = "Gia Dich Vu Khong Duoc De Trong")
    private Double giaDichVuDiKem;

    @Column(name = "don_vi_dich_vu_di_kem")
    @Min(value = 0)
    private Integer donViDichVuDiKem;

    @Column(name = "trang_thai_dich_vu_di_kem")
    @NotNull(message = "Trang Thai Dich Vu Khong Duoc De Trong")
    private String trangThaiDichVuDiKem;

    @OneToMany(mappedBy = "dichVuDiKem")
    private List<HopDongChiTiet> hopDongChiTietList;

    public DichVuDiKem() {
    }

    public DichVuDiKem(String tenDichVuDiKem, Double giaDichVuDiKem, Integer donViDichVuDiKem, String trangThaiDichVuDiKem) {
        this.tenDichVuDiKem = tenDichVuDiKem;
        this.giaDichVuDiKem = giaDichVuDiKem;
        this.donViDichVuDiKem = donViDichVuDiKem;
        this.trangThaiDichVuDiKem = trangThaiDichVuDiKem;
    }

    public Integer getIdDichVuDiKem() {
        return idDichVuDiKem;
    }

    public void setIdDichVuDiKem(Integer idDichVuDiKem) {
        this.idDichVuDiKem = idDichVuDiKem;
    }

    public String getTenDichVuDiKem() {
        return tenDichVuDiKem;
    }

    public void setTenDichVuDiKem(String tenDichVuDiKem) {
        this.tenDichVuDiKem = tenDichVuDiKem;
    }

    public Double getGiaDichVuDiKem() {
        return giaDichVuDiKem;
    }

    public void setGiaDichVuDiKem(Double giaDichVuDiKem) {
        this.giaDichVuDiKem = giaDichVuDiKem;
    }

    public Integer getDonViDichVuDiKem() {
        return donViDichVuDiKem;
    }

    public void setDonViDichVuDiKem(Integer donViDichVuDiKem) {
        this.donViDichVuDiKem = donViDichVuDiKem;
    }

    public String getTrangThaiDichVuDiKem() {
        return trangThaiDichVuDiKem;
    }

    public void setTrangThaiDichVuDiKem(String trangThaiDichVuDiKem) {
        this.trangThaiDichVuDiKem = trangThaiDichVuDiKem;
    }
}
