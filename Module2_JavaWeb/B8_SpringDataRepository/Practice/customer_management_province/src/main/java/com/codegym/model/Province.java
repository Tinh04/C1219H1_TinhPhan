package com.codegym.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "province_table")
public class Province {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_province")
    private Integer id;

    @Column(name = "province")
    private String nameProvince;

    @OneToMany(mappedBy = "province", cascade = CascadeType.ALL)
    private List<Customer> customerList;

    public Province() {
    }

    public Province(String nameProvince) {
        this.nameProvince = nameProvince;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameProvince() {
        return nameProvince;
    }

    public void setNameProvince(String nameProvince) {
        this.nameProvince = nameProvince;
    }

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }
}
