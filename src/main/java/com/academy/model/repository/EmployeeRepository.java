package com.academy.model.repository;

import com.academy.model.entity.Department;
import com.academy.model.entity.Employee;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
  List<Employee> findByName(Department department);
}
