package com.smarvet_api.model;


import com.sun.istack.NotNull;
import lombok.Data;

import javax.annotation.sql.DataSourceDefinitions;
import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Data
@Table(name="historiasClinicas")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idHistoriaClinica;

    @NotNull
    @Min(value = 1, message="Numero de ficha debe tener como minimo 1 numero")
    @Column(name ="numero_ficha", nullable = false, length = 5)
    private Integer numeroFicha;

    @NotNull
    @Column(name ="observacion", nullable = false, length = 100)
    private String observacion;

    @NotNull
    @Column(name ="diagnostico", nullable = false, length = 100)
    private String diagnostico;

    @NotNull
    @Column(name ="tratamiento", nullable = false, length = 100)
    private String tratamiento;

    @ManyToOne
    @JoinColumn(
            name="id_cita",
            nullable = false,
            foreignKey = @ForeignKey(name="FK_historia_cita")
    )
    private Cita idCita;

}
