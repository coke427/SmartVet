package com.smarvet_api.service.impl;

import com.smarvet_api.model.HistoriaClinica;
import com.smarvet_api.repositories.HistoriaClinicaRepository;
import com.smarvet_api.service.HistoriaClinicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriaClinicaImpl implements HistoriaClinicaService {
    @Autowired
    private HistoriaClinicaRepository historiaClinicaRepository;

    @Override
    public HistoriaClinica registrarHistoriaClinica(HistoriaClinica historiaClinica){return historiaClinicaRepository.save(historiaClinica); }
    @Override
    public List<HistoriaClinica> listarHistoriaClinica(){return historiaClinicaRepository.findAll(); }
    @Override
    public HistoriaClinica obtenerHistoriaClinicaPorId(Integer idhistoriaClinica){
        return historiaClinicaRepository.findById(idhistoriaClinica).orElse(new HistoriaClinica());
    }
    @Override
    public HistoriaClinica modificarHistoriaClinica(HistoriaClinica historiaClinica) {
        return historiaClinicaRepository.save(historiaClinica);
    }
    @Override
    public void eliminarHistoriaClinica(Integer idhistoriaClinica) {historiaClinicaRepository.deleteById(idhistoriaClinica);}


}
