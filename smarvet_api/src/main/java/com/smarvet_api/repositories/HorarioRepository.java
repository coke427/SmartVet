package com.smarvet_api.repositories;

import com.smarvet_api.model.Horario;
import com.smarvet_api.model.Veterinario;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HorarioRepository extends JpaRepository<Horario, Integer> {

    List<Horario> getByIdVeterinario(Veterinario veterinario);
}
