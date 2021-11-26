package com.smarvet_api.service;

import com.smarvet_api.model.Cita;
import com.smarvet_api.model.Horario;
import com.smarvet_api.model.Veterinario;

import java.util.List;

public interface HorarioService {

    Horario createHorario(Horario horario);
    List<Horario> listAll();
    List<Horario> listHorariosByVeterinario(Veterinario veterinario);
    Horario getHorario(Integer id);
    Horario updateHorario(Horario horario);
    void deleteHorario(Integer idHorario);

}
