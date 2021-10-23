package com.smarvet_api.model;


import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="historiasClinicas")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idhistoriaClinica;

    @NotNull
    @Size(min = 1, message = "Numero de ficha debe tener como minimo 1 numero")
    @Column(name ="numero_ficha", nullable = false, length = 5)
    private Integer numeroFicha;

    @NotNull
    @Column(name ="observacion", nullable = false, length = 100)
    private String observacion;
}
