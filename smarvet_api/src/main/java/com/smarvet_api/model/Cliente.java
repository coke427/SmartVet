package com.smarvet_api.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name="clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcliente;

    @NotNull
    @Size(min = 2, message = "Nombre debe tener como minimo 2 caracteres")
    @Column(name = "nombre_cliente", nullable = false, length = 30)
    private String nombreCliente;

    @NotNull
    @Size(min = 3, message = "Apellido debe tener como minimo 3 caracteres")
    @Column(name = "apellido_cliente", nullable = false, length = 30)
    private String apellidoCliente;

    @NotNull
    @Size(min = 8, message = "Dni debe tener 8 caracteres")
    @Column(name = "dni_cliente", nullable = false, length = 8)
    private String dniCliente;

    @Column(name = "telefono_cliente", nullable = true, length = 6)
    private String telefonoCliente;

    @Column(name = "celular_cliente", nullable = true, length = 9)
    private String celularCliente;

    @Column(name = "direccion_cliente", nullable = true, length = 200)
    private String direccionCliente;

    @Column(name = "email_cliente", nullable = true, length = 100)
    private String emailCliente;


}
