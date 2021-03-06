package com.smarvet_api.service.impl;

import com.smarvet_api.model.Cliente;
import com.smarvet_api.repositories.ClienteRepository;
import com.smarvet_api.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.smarvet_api.model.Cliente;
import com.smarvet_api.exception.GeneralServiceException;
import com.smarvet_api.exception.IncorrectResourceRequestException;
import com.smarvet_api.exception.ResourceNotFoundException;
import com.smarvet_api.repositories.ClienteRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository; //patron de diseño inyeccion de dependencias- inversion de control

    @Override
    public List<Cliente> listarCliente() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente registrarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public Cliente modificarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    @Override
    public void eliminarCliente(Integer idCliente) {clienteRepository.deleteById(idCliente);}

    @Override
    public Cliente obtenerClientePorId (Integer idCliente) {
        return clienteRepository.findById(idCliente).orElse(new Cliente());
    }
}
