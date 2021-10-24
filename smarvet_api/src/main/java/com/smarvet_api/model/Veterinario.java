package com.smarvet_api.model;

import com.sun.istack.NotNull;
import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="veterinarios")
public class Veterinario {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer idVeterinario;

    @NotNull
    @Size(min= 2, message = "Nombre debe tener como minimo 2 caracteres")
    @Column (name="nombre_veterinario", nullable = false, length = 30)
    private String nombreVeterinario;

    @NotNull
    @Size(min= 3, message = "Apellido debe tener como minimo 3 caracteres")
    @Column (name="apellido_veterinario", nullable = false, length = 30)
    private String apellidoVeterinario;

    @NotNull
    @Size(min= 8, message = "Dni debe tener 8 caracteres")
    @Column (name="dni_veterinario", nullable = false, length = 8)
    private String dniVeterinario;

    @Column (name="telefono_veterinario", nullable = true, length = 6)
    private String telefonoVeterinario;

    @Column (name="celular_veterinario", nullable = true, length = 9)
    private String celularVeterinario;

    @Column (name="direccion_veterinario", nullable = true, length = 200)
    private String direccionVeterinario;

    @Column (name="email_veterinario", nullable = true, length = 100)
    private String emailVeterinario;

    public Integer getIdVeterinario() {
        return idVeterinario;
    }
    public void setIdVeterinario(Integer idVeterinario) {
        this.idVeterinario = idVeterinario;
    }
    public String getNombreVeterinario() {
        return nombreVeterinario;
    }

    public void setNombreVeterinario(String nombreVeterinario) {
        this.nombreVeterinario = nombreVeterinario;
    }
    public String getApellidoVeterinario() {
        return apellidoVeterinario;
    }

    public void setApellidoVeterinario(String apellidoVeterinario) {
        this.apellidoVeterinario = apellidoVeterinario;
    }
    public String getDniVeterinario() {
        return dniVeterinario;
    }

    public void setDniVeterinario(String dniVeterinario) {
        this.dniVeterinario = dniVeterinario;
    }
    public String getTelefonoVeterinario() {
        return telefonoVeterinario;
    }

    public void setTelefonoVeterinario(String telefonoVeterinario) {
        this.telefonoVeterinario = telefonoVeterinario;
    }
    public String getCelularVeterinario() {
        return celularVeterinario;
    }

    public void setCelularVeterinario(String celularVeterinario) {
        this.celularVeterinario = celularVeterinario;
    }
    public String getDireccionVeterinario() {
        return direccionVeterinario;
    }

    public void setDireccionVeterinario(String direccionVeterinario) {
        this.direccionVeterinario = direccionVeterinario;
    }

    public String getEmailVeterinario() {
        return emailVeterinario;
    }
    public void setEmailVeterinario(String emailVeterinario) {
        this.emailVeterinario = emailVeterinario;
    }
}
