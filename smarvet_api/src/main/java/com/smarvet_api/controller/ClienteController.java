package com.smarvet_api.controller;

import com.smarvet_api.model.Cliente;
import com.smarvet_api.service.ClienteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes") ///identificador sustantivos en plural con relacion a la entidad

public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listarCliente() {
        List<Cliente> cliente = clienteService.listarCliente();
        return new ResponseEntity<List<Cliente>>(cliente, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> obtenerClientePorId(@PathVariable ("id")Integer idCliente) {
        Cliente cliente= clienteService.obtenerClientePorId(idCliente);
        return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
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

   @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCliente(@PathVariable ("id")Integer idCliente) {
        clienteService.eliminarCliente(idCliente);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }
}