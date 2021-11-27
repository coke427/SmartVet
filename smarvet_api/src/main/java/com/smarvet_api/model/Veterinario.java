package com.smarvet_api.model;

import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Data
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

}
