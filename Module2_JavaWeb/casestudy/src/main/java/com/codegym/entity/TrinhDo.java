package com.codegym.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "trinh_do")
public class TrinhDo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trinh_do")
    private Integer idTrinhDo;

    @Column(name = "ten_trinh_do")
    private String tenTrinhDo;

    @OneToMany(mappedBy = "trinhDo")
    private List<NhanVien> nhanVienList;

    public TrinhDo() {
    }

    public TrinhDo(String tenTrinhDo) {
        this.tenTrinhDo = tenTrinhDo;
    }

    public Integer getIdTrinhDo() {
        return idTrinhDo;
    }

    public void setIdTrinhDo(Integer idTrinhDo) {
        this.idTrinhDo = idTrinhDo;
    }

    public String getTenTrinhDo() {
        return tenTrinhDo;
    }

    public void setTenTrinhDo(String tenTrinhDo) {
        this.tenTrinhDo = tenTrinhDo;
    }
}
