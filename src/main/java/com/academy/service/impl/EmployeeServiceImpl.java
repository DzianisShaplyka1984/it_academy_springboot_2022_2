package com.academy.service.impl;

import com.academy.exception.EmployeeNotFoundException;
import com.academy.model.entity.Employee;
import com.academy.model.repository.EmployeeRepository;
import com.academy.service.EmployeeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
  private final EmployeeRepository repository;

  @Override
  public List<Employee> findAll() {
    return repository.findAll();
  }

  @Override
  public Employee getById(Integer id) {
    Employee employee = repository.getReferenceById(id);

    if (employee == null) {
      throw new EmployeeNotFoundException();
    }

    return employee;
  }
}
