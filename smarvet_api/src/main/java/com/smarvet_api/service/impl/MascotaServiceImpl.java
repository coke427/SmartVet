package com.smarvet_api.service.impl;


import com.smarvet_api.model.Mascota;
import com.smarvet_api.repositories.MascotaRepository;
import com.smarvet_api.service.MascotaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MascotaServiceImpl implements MascotaService {
    private final MascotaRepository mascotaRepository;

    public MascotaServiceImpl(MascotaRepository mascotaRepository) {
        this.mascotaRepository = mascotaRepository;
    }

    @Override
    public Mascota registrarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public Mascota modificarMascota(Mascota mascota) {
        return mascotaRepository.save(mascota);
    }

    @Override
    public List<Mascota> listarMascotas() {
        return mascotaRepository.findAll();
    }

    @Override
    public Mascota obtenerMascotaPorId(Integer idMascota) {
        return mascotaRepository.findById (idMascota).orElse (new Mascota());
    }

    @Override
    public void eliminarMascota(Integer idMascota) {
        mascotaRepository.deleteById(idMascota);
    }
}
