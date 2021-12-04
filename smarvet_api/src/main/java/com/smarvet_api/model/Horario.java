package com.smarvet_api.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Calendar;

@Data
@Entity
@Table(name="Horario")
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @Temporal(TemporalType.DATE)
    @Column(name="dia_año")
    private Calendar dia;


    @Temporal(TemporalType.DATE)
    @Column(name="fecha_horaInicio")
    private Calendar fechahoraInicio;

    @Temporal(TemporalType.DATE)
    @Column(name="fecha_horaFin")
    private Calendar fechahoraFin;

    @ManyToOne
    @JoinColumn(
            name="id_veterinario",
            nullable = true,
            foreignKey = @ForeignKey(name="FK_horario_veterinario")
    )
    private Veterinario idVeterinario;

}
