package com.fullstack888.firstspringbootproject.app.controller;

import com.fullstack888.firstspringbootproject.app.model.Employee;
import com.fullstack888.firstspringbootproject.app.service.EmployeeService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/employee")
public class EmployeeController {
    
    @Autowired
    EmployeeService employeeService;
    
    @GetMapping(value="/list", produces="application/json")
    public List<Employee> retrieveEmpleadoList(){
        List<Employee> empleados= employeeService.loadAll();
  
        return empleados;
    }
    
    @GetMapping(value = "/{id}", produces="application/json")
    public Employee retrieveEmploye(@PathVariable long id){
        Employee employee = employeeService.loadById(id);
        employee.getUbication();
        return employee;
    }
}
