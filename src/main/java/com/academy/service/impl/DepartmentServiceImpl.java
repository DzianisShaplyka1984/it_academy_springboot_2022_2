package com.academy.service.impl;

import com.academy.model.entity.Department;

import com.academy.model.repository.DepartmentRepository;
import com.academy.service.DepartmentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DepartmentServiceImpl implements DepartmentService {
  private final DepartmentRepository repository;

  @Override
  public List<Department> findAll() {
    return repository.findAll();
  }
}
