package com.codegym.entity;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.sql.Date;

@Entity
@Table(name = "employee")
public class Employee implements Validator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "employee")
    @NotEmpty
    private String name;

//    @ColumnDefault("date")
    @Column(name = "birthday")
    private Date birthday;

    @Column(name = "gender")
    private String gender;

    @Column(name = "phone")
    @NotEmpty
    private String phone;

    @Column(name = "id_card")
    @NotEmpty
    private String idCard;

    @Column(name = "email")
    @NotEmpty
    private String email;

    @Column(name = "address")
    @NotEmpty
    private String address;

    @Column(name = "classify")
    private String classify;

    public Employee() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getClassify() {
        return classify;
    }

    public void setClassify(String classify) {
        this.classify = classify;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return Employee.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Employee employee = (Employee) target;

        String phone = employee.getPhone();
        if (!(phone.length() == 10)) {
            errors.rejectValue("phone", "phone.length");
        }
        if (!phone.startsWith("0")) {
            errors.rejectValue("phone", "phone.startsWith");
        }
        if (!phone.matches("(^$|[0-9]*$)")) {
            errors.rejectValue("phone", "phone.matches");
        }

        String email = employee.getEmail();
        if (!email.matches("^[a-zA-Z][a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$")) {
            errors.rejectValue("email", "email.matches");
        }

        String idCard = employee.getIdCard();
        if(!(idCard.matches("^(\\d{10})$"))){
            errors.rejectValue("idCard","idCard.matches");
        }

    }


    //    Tinh tuoi tu ngay sinh
//LocalDate today = LocalDate.now();
// Today's date
//    LocalDate birthday = LocalDate.of(1959,8, 04);
// Birth date
//    Period p = Period.between(birthday, today);
//        System.out.println(p.getYears());

//    KhachHang khachHang = (KhachHang) target;
//        Calendar cal = Calendar.getInstance();
//        int ngayHienTai = cal.get(Calendar.DAY_OF_MONTH);
//        int thangHienTai = cal.get(Calendar.MONTH)+1;
//        int namHienTai = cal.get(Calendar.YEAR);
//        String ngaySinh = khachHang.ngaySinh;
//        String[] listNgaySinh = ngaySinh.split("-");
//        if (Integer.parseInt(listNgaySinh[0]) + 18 > namHienTai){
//            errors.rejectValue("ngaySinh", "errorNgaySinh");
//        }else if (Integer.parseInt(listNgaySinh[0]) + 18 == namHienTai){
//            if (Integer.parseInt(listNgaySinh[1]) > thangHienTai){
//                errors.rejectValue("ngaySinh", "errorNgaySinh");
//            }
//            else if (Integer.parseInt(listNgaySinh[1]) == thangHienTai){
//                if (Integer.parseInt(listNgaySinh[2]) > ngayHienTai){
//                    errors.rejectValue("ngaySinh", "errorNgaySinh");
//                }
//            }
//        }

//    public String saveTemp() {
//        String dateForm = "18-06-2020";
//        String[] dateArray = dateForm.split("-");
//
//        Temp temp = new Temp();
//        temp.setId((int) (Math.random() * 10000));
////        temp.setDateOfBirth("2020-06-26");
//        temp.setDateOfBirth(dateArray[2] + "-" + dateArray[1] + "-" + dateArray[0]);
//
//        tempService.save(temp);
//
//        tempService.findAll();
//
//        return "tempSuccess";
//    }
}
