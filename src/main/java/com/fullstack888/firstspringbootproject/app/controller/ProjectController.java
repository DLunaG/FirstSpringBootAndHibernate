/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fullstack888.firstspringbootproject.app.controller;

import com.fullstack888.firstspringbootproject.app.model.Project;
import com.fullstack888.firstspringbootproject.app.service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DLG
 */

@RestController
@RequestMapping("/project")
public class ProjectController {
    @Autowired
    ProjectService projectService;
    
    @GetMapping(value="/list", produces="application/json")
    
    public List<Project> retrieveProjectList(){
        List<Project> projects= projectService.loadAll();  
        return projects;
    }
    
    @GetMapping(value = "/{id}", produces="application/json")
    public Project retrieveProject(@PathVariable long id){
        Project project = projectService.loadById(id);
        return project;
    }
}
