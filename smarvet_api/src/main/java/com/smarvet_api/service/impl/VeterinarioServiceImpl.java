package com.smarvet_api.service.impl;

import com.smarvet_api.model.Veterinario;
import com.smarvet_api.repositories.VeterinarioRepository;
import com.smarvet_api.service.VeterinarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinarioServiceImpl implements VeterinarioService{
    @Autowired
    private VeterinarioRepository veterinarioRepository;

    @Override
    public Veterinario registrarVeterinario(Veterinario veterinario)
    {
        return veterinarioRepository.save(veterinario);
    }
    @Override
    public Veterinario modificarVeterinario(Veterinario veterinario) {return veterinarioRepository.save(veterinario); }
    @Override
    public List<Veterinario> listarVeterinario() {
        return veterinarioRepository.findAll();
    }

}
