package com.smarvet_api.service;

import com.smarvet_api.model.HistoriaClinica;

import java.util.List;

public interface HistoriaClinicaService {
    HistoriaClinica registrarHistoriaClinica(HistoriaClinica historiaClinica);
    HistoriaClinica modificarHistoriaClinica(HistoriaClinica historiaClinica);
    HistoriaClinica obtenerHistoriaClinicaPorId(Integer idhistoriaClinica);
    List<HistoriaClinica> listarHistoriaClinica();
    void eliminarHistoriaClinica(Integer idhistoriaClinica);
}
