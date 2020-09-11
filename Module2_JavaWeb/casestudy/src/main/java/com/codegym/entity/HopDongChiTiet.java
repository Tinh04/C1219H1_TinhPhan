package com.codegym.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import java.util.List;

@Entity
@Table(name = "hop_dong_chi_tiet")
public class HopDongChiTiet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_hop_dong_chi_tiet")
    private Integer idHopDongChiTiet;

    @Column(name = "so_luong")
    @Min(value = 0)
    private Integer soluong;

    @ManyToOne()
    @JoinColumn(name = "dich_vu_di_kem_id")
    private DichVuDiKem dichVuDiKem;

    @ManyToOne()
    @JoinColumn(name = "hop_dong_id")
    private HopDong hopDong;

    public HopDongChiTiet() {
    }

    public HopDongChiTiet(Integer soLuong) {
        this.soluong = soLuong;
    }

    public Integer getIdHopDongChiTiet() {
        return idHopDongChiTiet;
    }

    public void setIdHopDongChiTiet(Integer idHopDongChiTiet) {
        this.idHopDongChiTiet = idHopDongChiTiet;
    }

    public Integer getSoluong() {
        return soluong;
    }

    public void setSoluong(Integer soluong) {
        this.soluong = soluong;
    }

    public DichVuDiKem getDichVuDiKem() {
        return dichVuDiKem;
    }

    public void setDichVuDiKem(DichVuDiKem dichVuDiKem) {
        this.dichVuDiKem = dichVuDiKem;
    }

    public HopDong getHopDong() {
        return hopDong;
    }

    public void setHopDong(HopDong hopDong) {
        this.hopDong = hopDong;
    }

    public Integer getSoLuong() {
        return soluong;
    }

    public void setSoLuong(Integer soLuong) {
        this.soluong = soLuong;
    }
}
