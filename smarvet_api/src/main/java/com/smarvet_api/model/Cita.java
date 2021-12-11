package com.smarvet_api.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
@Entity
@Table(name = "Cita")
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_cita")
    private Integer id;

    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="fecha_hora", nullable=false)
    private Date fechaHora;


    @Size(min = 5, message = "Motivo debe tener 5 caracteres")
    @Column(name="motivo", nullable = true, length = 100)
    private String motivo;

    @ManyToOne
    @JoinColumn(
            name="id_mascota",
            nullable = false,
            foreignKey = @ForeignKey(name= "FK_cita_mascota")
    )
    private Mascota idMascota;


}
