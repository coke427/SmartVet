package com.smarvet_api.model;

import com.sun.istack.NotNull;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idcliente;

    @NotNull
    @Size(min= 2, message = "Nombre debe tener como minimo 2 caracteres")
    @Column (name="nombre_cliente", nullable = false, length = 30)
    private String nombreCliente;

    @NotNull
    @Size(min= 3, message = "Apellido debe tener como minimo 3 caracteres")
    @Column (name="apellido_cliente", nullable = false, length = 30)
    private String apellidoCliente;

    @NotNull
    @Size(min= 8, message = "Dni debe tener 8 caracteres")
    @Column (name="dni_cliente", nullable = false, length = 8)
    private String dniCliente;

    @Column (name="telefono_cliente", nullable = true, length = 6)
    private String telefonoCliente;

    @Column (name="celular_cliente", nullable = true, length = 9)
    private String celularCliente;

    @Column (name="direccion_cliente", nullable = true, length = 200)
    private String direccionCliente;

    @Column (name="email_cliente", nullable = true, length = 100)
    private String emailCliente;


    public Integer getIdcliente() { return idcliente; }
    public void setIdcliente(Integer idcliente) { this.idcliente = idcliente; }

    public String getNombreCliente() { return nombreCliente; }
    public void setNombreCliente(String nombreCliente) { this.nombreCliente = nombreCliente; }

    public String getApellidoCliente() { return apellidoCliente; }
    public void setApellidoCliente(String apellidoCliente) { this.apellidoCliente = apellidoCliente; }

    public String getDniCliente() { return dniCliente; }
    public void setDniCliente(String dniCliente) { this.dniCliente = dniCliente; }

    public String getTelefonoCliente() { return telefonoCliente; }
    public void setTelefonoCliente(String telefonoCliente) { this.telefonoCliente = telefonoCliente; }

    public String getDireccionCliente() { return direccionCliente; }
    public void setDireccionCliente(String direccionCliente) { this.direccionCliente = direccionCliente; }

    public String getCelularCliente() { return celularCliente; }
    public void setCelularCliente(String celularCliente) { this.celularCliente = celularCliente; }

    public String getEmailCliente() { return emailCliente; }
    public void setEmailCliente(String emailCliente) { this.emailCliente = emailCliente; }
    }
