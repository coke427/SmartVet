package com.smarvet_api.controller;

import com.smarvet_api.model.Mascota;
import com.smarvet_api.service.MascotaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/mascotas")
public class RegistrarMascota {
    private final MascotaService mascotaService;

    public RegistrarMascota(MascotaService mascotaService) {
        this.mascotaService = mascotaService;
    }

    @GetMapping
    public ResponseEntity<List<Mascota>> listarMascota() {
        List<Mascota> mascota = mascotaService.listarMascotas();
        return new ResponseEntity<List<Mascota>>(mascota, HttpStatus.CREATED);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Mascota> obtenerMascotaPorId(@PathVariable ("id")Integer idMascota){
        Mascota mascota= mascotaService.obtenerMascotaPorId(idMascota);
        return new ResponseEntity<Mascota>(mascota, HttpStatus.OK);

    }

    @PostMapping
    public ResponseEntity<Mascota> registrarMascota(@Valid @RequestBody Mascota mascota) {
        Mascota mascotaNew = mascotaService.registrarMascota(mascota);
        return new ResponseEntity<Mascota>(mascotaNew, HttpStatus.CREATED);

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
