package com.smarvet_api.repositories;

import com.smarvet_api.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MascotaRepository extends JpaRepository<Mascota, Integer> {

}
