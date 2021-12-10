package com.smarvet_api.controller;

import com.smarvet_api.model.Cita;
import com.smarvet_api.service.CitaService;
import com.smarvet_api.utils.WrapperResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/citas")
public class CitaController {
    private final CitaService citaService;

    public CitaController(CitaService citaService) {
        this.citaService = citaService;
    }
    @PostMapping
    public ResponseEntity<WrapperResponse<Cita>> createCita(@Valid @RequestBody Cita cita) {
        Cita cita1 = citaService.createCita(cita);
        return new WrapperResponse<Cita>(true, "success", cita).createResponse(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<WrapperResponse<List<Cita>>> listarCita() {
        List<Cita> cita= citaService.listCitas();
        return new WrapperResponse<>(true, "success", cita).createResponse(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cita> get(@PathVariable Integer id){
        return new ResponseEntity<Cita>(this.citaService.getCitaById(id), HttpStatus.OK);
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
