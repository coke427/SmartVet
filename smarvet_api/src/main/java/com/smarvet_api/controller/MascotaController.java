package com.smarvet_api.controller;

import com.smarvet_api.model.Mascota;
import com.smarvet_api.service.MascotaService;
import com.smarvet_api.utils.WrapperResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/mascota")
public class MascotaController {
    private final MascotaService mascotaService;

    public MascotaController(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @GetMapping
    public ResponseEntity<WrapperResponse<List<Mascota>>> listarMascota() {
        List<Mascota> mascota = mascotaService.listarMascotas();
        return new WrapperResponse<>(true, "success", mascota).createResponse(HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Mascota> obtenerMascotaPorId(@PathVariable ("id")Integer idMascota){
        Mascota mascota= mascotaService.obtenerMascotaPorId(idMascota);
        return new ResponseEntity<Mascota>(mascota, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<WrapperResponse<Mascota>> registrarMascota(@Valid @RequestBody Mascota mascota) {
        Mascota mascotaNew = mascotaService.registrarMascota(mascota);
        return new WrapperResponse<Mascota>(true, "success", mascotaNew).createResponse(HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<Mascota> modificarMascota(@Valid @RequestBody Mascota mascota) {
        Mascota mascotaUpdate = mascotaService.modificarMascota(mascota);
        return new ResponseEntity<Mascota>(mascotaUpdate, HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMascota(@PathVariable ("id")Integer idMascota) {
        mascotaService.eliminarMascota(idMascota);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}
