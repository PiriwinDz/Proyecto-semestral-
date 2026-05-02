package com.planes.planes.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // indica que esta clase es una entidad que se mapeara en una tabla de BD
@Table(name = "Pagos")
public class Pagos {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;


    @Column(nullable = false, unique = true)
    private String transaccionId; 

    @NotNull
    @Min(1)
    private Double monto;

    @NotBlank
    private String estado; // estado de la compra


    @NotBlank
    private String metodoPago; // debito credio o cualqueri cosa 

    private LocalDateTime fechaTransaccion;

    
}
