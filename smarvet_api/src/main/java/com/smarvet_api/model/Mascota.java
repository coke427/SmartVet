package com.smarvet_api.model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name ="mascotas")
public class Mascota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idMascota;

    @NotNull
    @Size(min= 4, message = "Nombre debe tener 4 caracteres")
    @Column(name = "nombres", nullable = false, length = 70 )
    private String nombre;

    @NotNull
    @Size(min = 4, message = "Especie debe tener 4 caracteres")
    @Column(name = "especies", nullable = false, length = 20)
    private String especie;

    @NotNull
    @Size(min = 4,  message = " Raza debe tener 4 caracteres")
    @Column(name = "raza", nullable = false, length = 20)
    private String raza;

    @NotNull
    @Size(min=4, message = "Sexo debe tener 4 caracteres")
    @Column(name = "sexo", nullable = false, length = 20)
    private String sexo;

    @NotNull
    @Size(min=1,  message = "Edad debe tener 1 caractere")
    @Column(name = "edad", nullable = false, length = 20)
    private String edad;

    public Integer getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Integer idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
}
