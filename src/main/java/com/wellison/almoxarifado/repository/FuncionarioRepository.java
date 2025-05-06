package com.wellison.almoxarifado.repository;

import com.wellison.almoxarifado.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    Funcionario findByemail(String email);
}
