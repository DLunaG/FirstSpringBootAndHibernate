package com.fullstack888.firstspringbootproject.app.service;

import com.fullstack888.firstspringbootproject.app.model.Project;
import com.fullstack888.firstspringbootproject.app.repository.ProjectRepository;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DLG
 */

@Service
@Transactional
public class ProjectService {
    @Autowired
    ProjectRepository projectRepository;
    
    @PersistenceContext
    private EntityManager entityManager;
    
    public List<Project> loadAll(){
        return projectRepository.findAll();
    }
    
    public Project loadById(long id){
        Project project = projectRepository.findById(id).orElse(new Project());
        return project;
    }
    
    @Transactional
    public void insertWithQuery(Project project) {
        entityManager.createNativeQuery("INSERT INTO project (name, hours, department) VALUES (?,?,?)")
        .setParameter(1, project.getName())
        .setParameter(2, project.getHours())
        .setParameter(3, project.getDepartment())
        .executeUpdate();
}
}