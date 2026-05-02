package com.planes.planes.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.planes.planes.model.Pagos;

public interface PagosRepository extends JpaRepository<Pagos,String> {

    Optional<Pagos> findBytransaccionId(String transaccionId);
    
    List<Pagos> findByEstado( String estado);

}
