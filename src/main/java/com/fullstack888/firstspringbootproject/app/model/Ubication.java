/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fullstack888.firstspringbootproject.app.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author DLG
 */

@Entity
public class Ubication {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ub_id;
    private String name;
    
    @ManyToMany(cascade = {
        CascadeType.PERSIST,
        CascadeType.MERGE
    })
    @JoinTable(
            name = "ubication_department",
            joinColumns = {@JoinColumn(name = "ub_id")},
            inverseJoinColumns = {@JoinColumn(name = "dept_id")}
    )
    private List<Department> departments;
    
    @OneToMany(mappedBy = "ubication",fetch = FetchType.EAGER, cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonBackReference
    private List<Employee> employees;
    
    public Ubication(){
    };

    public long getUb_id() {
        return ub_id;
    }

    public void setUb_id(long ub_id) {
        this.ub_id = ub_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
  
}
