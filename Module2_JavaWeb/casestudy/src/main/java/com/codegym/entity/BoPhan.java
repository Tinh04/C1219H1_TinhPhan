package com.codegym.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "bo_phan")
public class BoPhan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_bo_phan")
    private Integer idBoPhan;

    @Column(name = "ten_bo_phan")
    private String tenBoPhan;

    @OneToMany(mappedBy = "boPhan")
    private List<NhanVien> nhanVienList;

    public BoPhan() {
    }

    public BoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public Integer getIdBoPhan() {
        return idBoPhan;
    }

    public void setIdBoPhan(Integer idBoPhan) {
        this.idBoPhan = idBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }
}
