package com.smarvet_api.repositories;

import com.smarvet_api.model.HistoriaClinica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoriaClinicaRepository extends JpaRepository<HistoriaClinica, Integer> {

}
