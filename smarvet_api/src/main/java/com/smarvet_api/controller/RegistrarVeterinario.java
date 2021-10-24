package com.smarvet_api.controller;

import com.smarvet_api.model.Cliente;
import com.smarvet_api.model.Veterinario;
import com.smarvet_api.service.VeterinarioService;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

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

    @PutMapping
    public ResponseEntity<Veterinario> modificarVeterinario(@Valid @RequestBody Veterinario veterinario) {
        Veterinario veterinarioUpdate = veterinarioService.modificarVeterinario(veterinario);
        return new ResponseEntity<Veterinario>(veterinarioUpdate, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Veterinario>> listarVeterinario() {
        List<Veterinario> veterinario = veterinarioService.listarVeterinario();
        return new ResponseEntity<List<Veterinario>>(veterinario, HttpStatus.CREATED);
    }

}
