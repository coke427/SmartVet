package com.smarvet_api.validators;

import com.smarvet_api.model.Veterinario;
import com.smarvet_api.exception.IncorrectResourceRequestException;

public class VeterinarioValidator {

    public static void validate(Veterinario veterinario) {

        if(veterinario.getNombreVeterinario() == null || veterinario.getNombreVeterinario().trim().isEmpty()) {
            throw new IncorrectResourceRequestException("El Nombre es requerido");
        }

        if(veterinario.getNombreVeterinario().length() < 3) {
            throw new IncorrectResourceRequestException("El Nombre debe tener como minimo 3 letras");
        }

        if(veterinario.getApellidoVeterinario() == null || veterinario.getApellidoVeterinario().trim().isEmpty()) {
            throw new IncorrectResourceRequestException("El Apellido es requerido");
        }

        if(veterinario.getApellidoVeterinario().length() < 3) {
            throw new IncorrectResourceRequestException("El Apellido debe tener como minimo 3 letras");
        }

        if(veterinario.getDniVeterinario().length() == 8) {
            throw new IncorrectResourceRequestException("El dni debe tener 8 caracteres");
        }

        if(veterinario.getTelefonoVeterinario().length() == 6) {
            throw new IncorrectResourceRequestException("El numero de telefono debe tener 6 caracteres");
        }

        if(veterinario.getCelularVeterinario().length() == 9) {
            throw new IncorrectResourceRequestException("El numero de celular debe tener 9 caracteres");
        }
    }
}