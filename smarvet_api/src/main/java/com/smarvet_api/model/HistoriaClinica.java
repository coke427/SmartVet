package com.smarvet_api.model;


import com.sun.istack.NotNull;

import javax.persistence.*;
import javax.validation.constraints.Min;

@Entity
@Table(name="historiasClinicas")
public class HistoriaClinica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idhistoriaClinica;

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

    public Integer getIdhistoriaClinica() {
        return idhistoriaClinica;
    }

    public void setIdhistoriaClinica(Integer idhistoriaClinica) {
        this.idhistoriaClinica = idhistoriaClinica;
    }

    public Integer getNumeroFicha() {
        return numeroFicha;
    }

    public void setNumeroFicha(Integer numeroFicha) {
        this.numeroFicha = numeroFicha;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
}
