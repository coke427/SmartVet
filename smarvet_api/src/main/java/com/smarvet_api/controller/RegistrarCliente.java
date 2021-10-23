package com.smarvet_api.controller;

import com.smarvet_api.model.Cliente;
import com.smarvet_api.service.ClienteService;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes") ///identificador sustantivos en plural con relacion a la entidad

public class RegistrarCliente {

    private final ClienteService clienteService;

    public RegistrarCliente(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listarCliente() {
        List<Cliente> cliente = clienteService.listarCliente();
        return new ResponseEntity<List<Cliente>>(cliente, HttpStatus.CREATED);
    }

    @PostMapping
    public ResponseEntity <Cliente> registrarCliente (@RequestBody Cliente cliente) {
        Cliente cliente1 = clienteService.registrarCliente(cliente);
        return new ResponseEntity<Cliente>(cliente1, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<Cliente> modificarCliente(@Valid @RequestBody Cliente cliente) {
        Cliente clienteUpdate = clienteService.modificarCliente(cliente);
        return new ResponseEntity<Cliente>(clienteUpdate, HttpStatus.CREATED);
    }
}
