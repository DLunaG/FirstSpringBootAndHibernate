package com.fullstack888.firstspringbootproject.app.service;

import com.fullstack888.firstspringbootproject.app.model.Department;
import com.fullstack888.firstspringbootproject.app.repository.DepartmentRepository;
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
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;
    
    public List<Department> loadAll(){
        return departmentRepository.findAll();
    }
}
