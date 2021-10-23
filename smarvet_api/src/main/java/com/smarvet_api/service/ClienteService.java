package com.smarvet_api.service;

import com.smarvet_api.model.Cliente;


import java.util.List;

public interface ClienteService {

    Cliente registrarCliente(Cliente cliente);
    Cliente modificarCliente (Cliente cliente);
    List<Cliente> listarCliente();


}
