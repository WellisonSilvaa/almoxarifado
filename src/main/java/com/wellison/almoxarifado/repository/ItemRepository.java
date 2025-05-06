package com.wellison.almoxarifado.repository;

import com.wellison.almoxarifado.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item, Long> {
}
