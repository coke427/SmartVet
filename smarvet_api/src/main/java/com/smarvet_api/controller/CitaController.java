package com.smarvet_api.controller;

import com.smarvet_api.model.Cita;
import com.smarvet_api.model.Veterinario;
import com.smarvet_api.service.CitaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {

    CitaService citaService;

    CitaController(CitaService citaService){
        this.citaService = citaService;
    }

    @PostMapping
    public ResponseEntity<Cita> createCita(@RequestBody Cita cita){
        return new ResponseEntity<Cita>(this.citaService.createCita(cita),HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Cita>> getAll(){
        return new ResponseEntity<List<Cita>>(this.citaService.listCitas(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cita> get(@PathVariable Integer id){
        return new ResponseEntity<Cita>(this.citaService.getCitaById(id), HttpStatus.OK);
    }

    @GetMapping("/byVet")
    public ResponseEntity<List<Cita>> getByVet(@RequestParam Veterinario veterinario){
        return new ResponseEntity<>(this.citaService.getCitaByVet(veterinario), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Cita> updateCita(@RequestBody Cita cita){
        return new ResponseEntity<Cita>(this.citaService.updateCita(cita), HttpStatus.OK );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCita(@PathVariable Integer id){
        this.citaService.deleteCita(id);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
