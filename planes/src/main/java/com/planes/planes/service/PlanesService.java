package com.planes.planes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.planes.planes.model.Planes;
import com.planes.planes.repository.PlanesRepository;

public class PlanesService {
 @Autowired
    private final PlanesRepository repository;


    public List<Planes> listar(){
        return repository.findAll();
    }

    

}
