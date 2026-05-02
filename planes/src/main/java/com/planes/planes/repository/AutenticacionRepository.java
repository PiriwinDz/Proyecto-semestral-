package com.planes.planes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.planes.planes.model.Autenticacion;


@Repository
public interface AutenticacionRepository extends JpaRepository<Autenticacion,Integer>{
    List<Autenticacion>findByUsername(String username);
    Optional<Autenticacion>findByGmail(String Gmail);
}
