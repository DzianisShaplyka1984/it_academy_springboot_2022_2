package com.academy.service;

import com.academy.model.entity.Employee;
import java.util.List;

public interface EmployeeService {
  List<Employee> findAll();

  Employee getById(Integer id);
}
