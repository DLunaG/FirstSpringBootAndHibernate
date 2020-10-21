/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fullstack888.firstspringbootproject.app.repository;

import com.fullstack888.firstspringbootproject.app.model.Ubication;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author DLG
 */
@Repository
@Transactional
public interface UbicationRepository extends JpaRepository<Ubication, Long> {
    
}
