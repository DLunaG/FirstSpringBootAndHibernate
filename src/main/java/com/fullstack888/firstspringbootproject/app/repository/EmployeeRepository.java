package com.fullstack888.firstspringbootproject.app.repository;


import com.fullstack888.firstspringbootproject.app.model.Employee;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DLG
 */

@Repository
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}

    



