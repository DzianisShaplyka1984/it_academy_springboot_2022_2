package com.academy.controller;

import com.academy.model.entity.Employee;
import com.academy.service.EmployeeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BookController {
  private final EmployeeService service;

  @GetMapping(value = "/employees")
  public String employees(Model model) {
    List<Employee> employees = service.findAll();

    model.addAttribute("employees", employees);

    return "employee";
  }
}
