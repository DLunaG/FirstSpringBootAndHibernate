/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fullstack888.firstspringbootproject.app.service;

import com.fullstack888.firstspringbootproject.app.model.Ubication;
import com.fullstack888.firstspringbootproject.app.repository.UbicationRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DLG
 */

@Service
public class UbicationService {
    @Autowired
    UbicationRepository ubicationRepository;
    
    public List<Ubication> loadAll(){
        return ubicationRepository.findAll();
    }
    
    
}
