package com.planes.planes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.planes.planes.model.Planes;


@Repository


public interface PlanesRepository extends JpaRepository<Planes,Integer>{
        List<Planes>findByValor(Integer valor);

}
