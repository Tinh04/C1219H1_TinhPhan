package com.codegym.entity;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "kieu_thue")
public class KieuThue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_kieu_thue")
    private Integer idKieuThue;

    @Column(name = "ten_kieu_thue")
    private String tenKieuThue;

    @Column(name = "gia_kieu_thue")
    @Min(value = 0)
    private Double giaKieuThue;

    @OneToMany(mappedBy = "kieuThue")
    private List<DichVu> dichVuList;

    public KieuThue() {
    }

    public KieuThue(String tenKieuThue, Double giaKieuThue) {
        this.tenKieuThue = tenKieuThue;
        this.giaKieuThue = giaKieuThue;
    }

    public Integer getIdKieuThue() {
        return idKieuThue;
    }

    public void setIdKieuThue(Integer idKieuThue) {
        this.idKieuThue = idKieuThue;
    }

    public String getTenKieuThue() {
        return tenKieuThue;
    }

    public void setTenKieuThue(String tenKieuThue) {
        this.tenKieuThue = tenKieuThue;
    }

    public Double getGiaKieuThue() {
        return giaKieuThue;
    }

    public void setGiaKieuThue(Double giaKieuThue) {
        this.giaKieuThue = giaKieuThue;
    }
}
