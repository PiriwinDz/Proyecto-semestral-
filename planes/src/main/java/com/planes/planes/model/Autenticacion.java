package com.planes.planes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity // indica que esta clase es una entidad que se mapeara en una tabla de BD
@Table(name = "Autenticacion")

public class Autenticacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull(message = "El correo no puede estar vacio")
    @Column(nullable = false, length = 50)
    private String Gmail;

    @NotNull(message = "El usuario no puede estar vacio")
    @Column(nullable = false, length = 50)
    private String username;

    @NotBlank(message = "La contraseña no puede estar vacia")
    @Column(nullable = false, length = 50)
    @Size(min=8)
    private String password;

    @Column(unique = true, length = 50)
    @NotBlank(message = "No puede estar vacio")
    private String rol;



}
