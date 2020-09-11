package com.codegym.service;

import com.codegym.entity.Employee;

import java.util.List;


public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(Integer id);

    void save(Employee a);

    void remove(Integer id);

    List<Employee> findAllByIdAndBirthdayContainingAndIdCard(Integer id, String birhtday, String idCard);

    List<Employee> findAllByBirthdayContaining(String birthday);

    List<Employee> findAllByIdCard(String idCard);

    List<Employee> findAllById(Integer id);
}
