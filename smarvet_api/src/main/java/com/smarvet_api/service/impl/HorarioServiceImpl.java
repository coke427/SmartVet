package com.smarvet_api.service.impl;


import com.smarvet_api.model.Horario;
import com.smarvet_api.repositories.HorarioRepository;
import com.smarvet_api.service.HorarioService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HorarioServiceImpl implements HorarioService {

    private final HorarioRepository horarioRepository;

    HorarioServiceImpl(HorarioRepository horarioRepository){
        this.horarioRepository = horarioRepository;
    }

    @Override
    public Horario createHorario(Horario horario) {
        return this.horarioRepository.save(horario);
    }

    @Override
    public List<Horario> listHorarios() {
        return null;
    }

    @Override
    public Horario getHorario(Integer id) {
        return this.horarioRepository.getById(id);
    }

    @Override
    public Horario updateHorario(Horario horario) {
        return this.horarioRepository.save(horario);
    }

    @Override
    public void deleteHorario(Integer idHorario) {
        this.horarioRepository.deleteById(idHorario);
    }
}
