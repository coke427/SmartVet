package com.smarvet_api.validators;

import com.smarvet_api.model.Cliente;
import com.smarvet_api.exception.IncorrectResourceRequestException;

public class ClienteValidator {

    public static void validate(Cliente cliente) {

        if(cliente.getNombreCliente() == null || cliente.getNombreCliente().trim().isEmpty()) {
            throw new IncorrectResourceRequestException("El Nombre es requerido");
        }

        if(cliente.getNombreCliente().length() < 3) {
            throw new IncorrectResourceRequestException("El Nombre debe tener como minimo 3 letras");
        }

        if(cliente.getApellidoCliente() == null || cliente.getApellidoCliente().trim().isEmpty()) {
            throw new IncorrectResourceRequestException("El Apellido es requerido");
        }

        if(cliente.getApellidoCliente().length() < 3) {
            throw new IncorrectResourceRequestException("El Apellido debe tener como minimo 3 letras");
        }

        if(cliente.getDniCliente().length() == 8) {
            throw new IncorrectResourceRequestException("El dni debe tener 8 caracteres");
        }

        if(cliente.getTelefonoCliente().length() == 6) {
            throw new IncorrectResourceRequestException("El numero de telefono debe tener 6 caracteres");
        }

        if(cliente.getCelularCliente().length() == 9) {
            throw new IncorrectResourceRequestException("El numero de celular debe tener 9 caracteres");
        }
    }
}