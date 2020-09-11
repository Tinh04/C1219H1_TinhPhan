package com.codegym.repository;

import com.codegym.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    List<Employee> findAllByIdAndBirthdayContainingAndIdCard(Integer id, String birhtday, String idCard);

    List<Employee> findAllByBirthdayContaining(String birthday);

    List<Employee> findAllByIdCard(String idCard);

    List<Employee> findAllById(Integer id);
}
