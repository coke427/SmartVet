package com.smarvet_api.service;

import com.smarvet_api.model.Cita;
import com.smarvet_api.model.Veterinario;

import java.util.List;
public interface CitaService {

    Cita createCita(Cita cita);
    List<Cita> listCitas();
    Cita getCitaById(Integer id);
    List<Cita> getCitaByVet(Veterinario veterinario);
    Cita updateCita(Cita cita);
    void deleteCita(Integer id);
}
