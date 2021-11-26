package com.smarvet_api.model;

import javax.persistence.*;
import java.sql.Time;
import java.util.Calendar;
import java.util.Date;

@Entity
@Table(name="Horario")
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Temporal(TemporalType.DATE)
    private Date dia;

    private Time horaInicio;

    private Time horaFin;

    @ManyToOne
    @JoinColumn(
            name = "id_veterinario",
            nullable = false,
            foreignKey = @ForeignKey(name="FK_horario_veterinario")
    )
    private Veterinario idVeterinario;
}
