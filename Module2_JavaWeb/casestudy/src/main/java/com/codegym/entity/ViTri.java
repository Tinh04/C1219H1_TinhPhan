package com.codegym.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "vi_tri")
public class ViTri {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vi_tri")
    private Integer idViTri;

    @Column(name = "ten_vi_tri")
    private String tenViTri;

    @OneToMany(mappedBy = "viTri")
    private List<NhanVien> nhanVienList;

    public ViTri() {
    }

    public ViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }

    public Integer getIdViTri() {
        return idViTri;
    }

    public void setIdViTri(Integer idViTri) {
        this.idViTri = idViTri;
    }

    public String getTenViTri() {
        return tenViTri;
    }

    public void setTenViTri(String tenViTri) {
        this.tenViTri = tenViTri;
    }
}
