package com.planes.planes.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // indica que esta clase es una entidad que se mapeara en una tabla de BD
@Table(name = "planes")

public class Planes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "El valor no puede estar vacio")
    private Integer valor;

    @NotBlank(message = "La descrpicion no puede estar vacía")
    private String descripicion;


}
