package com.codegym.service.impl;

import com.codegym.entity.Employee;
import com.codegym.repository.EmployeeRepository;
import com.codegym.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(Integer id) {
        return employeeRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Employee a) {
        employeeRepository.save(a);
    }

    @Override
    public void remove(Integer id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findAllByIdAndBirthdayContainingAndIdCard(Integer id, String birhtday, String idCard) {
        return employeeRepository.findAllByIdAndBirthdayContainingAndIdCard(id, birhtday, idCard);
    }

    @Override
    public List<Employee> findAllByBirthdayContaining(String birthday) {
        return employeeRepository.findAllByBirthdayContaining(birthday);
    }

    @Override
    public List<Employee> findAllByIdCard(String idCard) {
        return employeeRepository.findAllByIdCard(idCard);
    }

    @Override
    public List<Employee> findAllById(Integer id) {
        return employeeRepository.findAllById(id);
    }


}
