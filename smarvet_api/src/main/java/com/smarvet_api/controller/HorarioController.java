package com.smarvet_api.controller;

import com.smarvet_api.model.Horario;
import com.smarvet_api.model.Veterinario;
import com.smarvet_api.service.HorarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/horarios")
public class HorarioController {

    private final HorarioService horarioService;

    HorarioController(HorarioService horarioService){
        this.horarioService = horarioService;
    }

    @PostMapping
    public ResponseEntity<Horario> createHorario(@RequestBody Horario horario){
        return new ResponseEntity<Horario>(this.horarioService.createHorario(horario), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Horario>> getAll(){
        return new ResponseEntity<List<Horario>>(this.horarioService.listAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Horario> get(@PathVariable Integer id){
        return new ResponseEntity<Horario>(this.horarioService.getHorario(id), HttpStatus.OK);
    }

    @GetMapping("/byVet")
    public ResponseEntity<List<Horario>> getByVet(@RequestParam Veterinario veterinario){
        return new ResponseEntity<List<Horario>>(
                this.horarioService.listHorariosByVeterinario(veterinario),
                HttpStatus.OK
        );
    }

    @PutMapping
    public ResponseEntity<Horario> updateHorario(@RequestBody Horario horario){
        return new ResponseEntity<Horario>(
                this.horarioService.updateHorario(horario),
                HttpStatus.OK
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteHorario(@PathVariable Integer id){
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

}
