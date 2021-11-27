package com.smarvet_api.service.impl;

import com.smarvet_api.model.Cita;
import com.smarvet_api.model.Veterinario;
import com.smarvet_api.repositories.CitaRepository;
import com.smarvet_api.service.CitaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {

    private final CitaRepository citaRepository;

    CitaServiceImpl(CitaRepository citaRepository){
        this.citaRepository = citaRepository;
    }

    public List<Cita> listAll(){
        return this.citaRepository.findAll();
    }

    @Override
    public Cita createCita(Cita cita) {
        return this.citaRepository.save(cita);
    }

    @Override
    public List<Cita> listCitas() {
        return this.citaRepository.findAll();
    }

    @Override
    public Cita getCitaById(Integer id) {
        return this.citaRepository.getById(id);
    }

    @Override
    public List<Cita> getCitaByVet(Veterinario veterinario) {
        return this.citaRepository.getCitaByIdVeterinario(veterinario);
    }

    @Override
    public Cita updateCita(Cita cita) {
        return this.citaRepository.save(cita);
    }

    @Override
    public void deleteCita(Integer id) {
       this.citaRepository.deleteById(id);
    }
}
