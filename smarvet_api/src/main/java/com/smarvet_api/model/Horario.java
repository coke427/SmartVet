package com.smarvet_api.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Calendar;

@Data
@Entity
@Builder

@Table(name="Horario")
public class Horario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;


    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name="dia_año",nullable = false, updatable = false)
    private LocalDate diaaño;


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
