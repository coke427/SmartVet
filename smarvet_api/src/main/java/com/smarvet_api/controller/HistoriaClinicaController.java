package com.smarvet_api.controller;

import com.smarvet_api.model.HistoriaClinica;
import com.smarvet_api.service.HistoriaClinicaService;
import com.smarvet_api.utils.WrapperResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/historiasClinicas")
public class HistoriaClinicaController {
    private final HistoriaClinicaService historiaClinicaService;

    public HistoriaClinicaController(HistoriaClinicaService historiaClinicaService) {
        this.historiaClinicaService = historiaClinicaService;
    }

    @PostMapping
    public ResponseEntity<WrapperResponse<HistoriaClinica>> registrarHistoriaClinica(@Valid @RequestBody HistoriaClinica historiaClinica) {
        HistoriaClinica historialClinica = historiaClinicaService.registrarHistoriaClinica(historiaClinica);
        return new WrapperResponse<HistoriaClinica>(true, "success", historialClinica).createResponse(HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<WrapperResponse<List<HistoriaClinica>>> listarHistoriaClinica() {
        List<HistoriaClinica> historiaClinica= historiaClinicaService.listarHistoriaClinica();
        return new WrapperResponse<>(true, "success", historiaClinica).createResponse(HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HistoriaClinica> obtenerHistoriaClinicaPorId(@PathVariable ("id")Integer idhistoriaClinica) {
        HistoriaClinica historiaClinica = historiaClinicaService.obtenerHistoriaClinicaPorId(idhistoriaClinica);
        return new ResponseEntity<HistoriaClinica>(historiaClinica, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<WrapperResponse<HistoriaClinica>>modificarHistoriaClinica(@RequestBody HistoriaClinica historiaClinica){
        HistoriaClinica historiaClinicaUpdate= historiaClinicaService.modificarHistoriaClinica(historiaClinica);
        return new WrapperResponse<HistoriaClinica>(true, "success", historiaClinica).createResponse(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarHistoriaClinica(@PathVariable ("id")Integer idhistoriaClinica) {
        historiaClinicaService.eliminarHistoriaClinica(idhistoriaClinica);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
