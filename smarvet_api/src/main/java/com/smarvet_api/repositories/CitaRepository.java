package com.smarvet_api.repositories;

import com.smarvet_api.model.Cita;
import com.smarvet_api.model.Veterinario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitaRepository extends JpaRepository<Cita, Integer> {

    List<Cita> getCitaByIdVeterinario(Veterinario veterinario);
}
