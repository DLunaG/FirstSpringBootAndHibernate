/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fullstack888.firstspringbootproject.app.controller;

import com.fullstack888.firstspringbootproject.app.model.Department;
import com.fullstack888.firstspringbootproject.app.service.DepartmentService;
import com.fullstack888.firstspringbootproject.app.service.UbicationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DLG
 */
@RestController
@RequestMapping(value="/department")
public class DepartmentController {
    @Autowired
    DepartmentService departmentService;
    
    @GetMapping(value="/list", produces="application/json")
    public List<Department> retrieveUbicationList(){
        List<Department> ubications = departmentService.loadAll();
        
        return ubications;
    }
}
