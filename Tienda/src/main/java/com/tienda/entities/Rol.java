package com.tienda.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
import javax.validation.constraints.NotEmpty;

@Entity
@Data
@Table(name = "rol")
public class Rol implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRol;

    @NotEmpty
    private String nombre;

    @Column(name = "id_usuario")
    private Long idUsuario;
}
