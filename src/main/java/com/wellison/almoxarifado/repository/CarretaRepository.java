package com.wellison.almoxarifado.repository;

import com.wellison.almoxarifado.model.Carreta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarretaRepository extends JpaRepository<Carreta, Long> {
    Carreta findByPlaca(String placa);
}
