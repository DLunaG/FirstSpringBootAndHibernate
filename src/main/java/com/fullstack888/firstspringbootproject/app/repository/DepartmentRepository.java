/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fullstack888.firstspringbootproject.app.repository;

import com.fullstack888.firstspringbootproject.app.model.Department;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DLG
 */

@Repository
@Transactional
public interface DepartmentRepository extends JpaRepository<Department, Long>{
    
}
