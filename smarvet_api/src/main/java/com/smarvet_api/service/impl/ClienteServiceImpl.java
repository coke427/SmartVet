package com.smarvet_api.service.impl;

import com.smarvet_api.model.Cliente;
import com.smarvet_api.repositories.ClienteRepository;
import com.smarvet_api.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository; //patron de diseño inyeccion de dependencias- inversion de control
    @Override
    public Cliente registrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
