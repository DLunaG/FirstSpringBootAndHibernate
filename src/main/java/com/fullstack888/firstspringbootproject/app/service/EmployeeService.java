/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fullstack888.firstspringbootproject.app.service;

import com.fullstack888.firstspringbootproject.app.model.Employee;
import com.fullstack888.firstspringbootproject.app.repository.EmployeeRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author tecnara
 */

@Service
@Transactional
public class EmployeeService {
    @Autowired
    EmployeeRepository repository;
    
    public List<Employee> loadAll(){
        return repository.findAll();
    }
    
    public Employee loadById(long id){
        Employee e = repository.findById(id).orElse(new Employee());
        e.getUbication();
        return e;
    }
}
