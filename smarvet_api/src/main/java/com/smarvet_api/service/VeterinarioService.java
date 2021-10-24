package com.smarvet_api.service;

import com.smarvet_api.model.Veterinario;

import java.util.List;

public interface VeterinarioService {

    Veterinario registrarVeterinario(Veterinario veterinario);

    List<Veterinario> listarVeterinario();
}
