package com.smarvet_api.controller;

import com.smarvet_api.model.Cliente;
import com.smarvet_api.service.ClienteService;
import lombok.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes") ///identificador sustantivos en plural con relacion a la entidad

public class RegistrarCliente {

    private final ClienteService clienteService;

    public RegistrarCliente(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @PostMapping
    public ResponseEntity <Cliente> registrarCliente (@RequestBody Cliente cliente) {
        Cliente cliente1 = clienteService.registrarCliente(cliente);
        return new ResponseEntity<Cliente>(cliente1, HttpStatus.CREATED);
    }
}
