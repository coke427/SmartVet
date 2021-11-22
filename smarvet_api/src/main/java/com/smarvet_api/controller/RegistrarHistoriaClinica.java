package com.smarvet_api.controller;

import com.smarvet_api.model.HistoriaClinica;
import com.smarvet_api.service.HistoriaClinicaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/historiasClinicas")
public class RegistrarHistoriaClinica {
    private final HistoriaClinicaService historiaClinicaService;

    public RegistrarHistoriaClinica(HistoriaClinicaService historiaClinicaService) {
        this.historiaClinicaService = historiaClinicaService;
    }

    @PostMapping
    public ResponseEntity<HistoriaClinica> registrarHistoriaClinica (@Valid @RequestBody HistoriaClinica historiaClinica) {
        HistoriaClinica historiaClinica1 = historiaClinicaService.registrarHistoriaClinica(historiaClinica);
        return new ResponseEntity<HistoriaClinica>(historiaClinica1, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<HistoriaClinica>> listarHistoriaClinica() {
        List<HistoriaClinica> historiaClinica = historiaClinicaService.listarHistoriaClinica();
        return new ResponseEntity<List<HistoriaClinica>>(historiaClinica, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HistoriaClinica> obtenerHistoriaClinicaPorId(@PathVariable ("id")Integer idhistoriaClinica) {
        HistoriaClinica historiaClinica = historiaClinicaService.obtenerHistoriaClinicaPorId(idhistoriaClinica);
        return new ResponseEntity<HistoriaClinica>(historiaClinica, HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<HistoriaClinica> modificarHistoriaClinica(@Valid @RequestBody HistoriaClinica historiaClinica) {
        HistoriaClinica historiaClinicaUpdate = historiaClinicaService.modificarHistoriaClinica(historiaClinica);
        return new ResponseEntity<HistoriaClinica>(historiaClinicaUpdate, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarHistoriaClinica(@PathVariable ("id")Integer idhistoriaClinica) {
        historiaClinicaService.eliminarHistoriaClinica(idhistoriaClinica);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
