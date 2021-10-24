package com.smarvet_api.controller;

import com.smarvet_api.model.Veterinario;
import com.smarvet_api.service.VeterinarioService;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/veterinarios")
public class RegistrarVeterinario {
    private final VeterinarioService veterinarioService;

    public RegistrarVeterinario(VeterinarioService veterinarioService) {
        this.veterinarioService = veterinarioService;
    }

    @PostMapping
    public ResponseEntity<Veterinario> registrarVeterinario (@Valid @RequestBody Veterinario veterinario) {
        Veterinario veterinario1 = veterinarioService.registrarVeterinario(veterinario);
        return new ResponseEntity<Veterinario>(veterinario1, HttpStatus.CREATED);
    }
}
