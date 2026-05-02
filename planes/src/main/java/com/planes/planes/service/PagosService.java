package com.planes.planes.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.planes.planes.model.Pagos;
import com.planes.planes.repository.PagosRepository;
import com.planes.planes.repository.PlanesRepository;

public class PagosService {
    @Autowired
    private PagosRepository pagosRepository; 
    @Autowired
    private PlanesRepository planesRepository;


    public Pagos procesarPago(String transaccionId){
        return pagosRepository.findBytransaccionId(transaccionId).orElseThrow(() -> new RuntimeException("El pago con ID " + transaccionId + " no existe"));
        
    }

    public Pagos estadoPago(String estado){
        return pagosRepository.findBytransaccionId(estado).orElseThrow(() -> new RuntimeException("Se" + estado + " el pago"));
    }

}
// estoy probando esto madre mia chaval que no puedo 