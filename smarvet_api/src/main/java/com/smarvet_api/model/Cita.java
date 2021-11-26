package com.smarvet_api.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.sql.Time;
import java.util.Calendar;

@Data
@Entity
@Table(name = "Cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cita")
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Calendar fecha;

    private Time hora;

    @Size(min = 5, message = "Motivo debe tener 5 caracteres")
    @Column(name="motivo", nullable = false, length = 100)
    private String motivo;

    @ManyToOne
    @JoinColumn(
            name="id_veterinario",
            nullable = false,
            foreignKey = @ForeignKey(name= "FK_cita_veterinario")
    )
    private Veterinario idVeterinario;

    @ManyToOne
    @JoinColumn(
            name="id_mascota",
            nullable = false,
            foreignKey = @ForeignKey(name= "FK_cita_mascota")
    )
    private Mascota idMascota;


}
