package cz.inventi.springdataacademy.db.repository;

import cz.inventi.springdataacademy.db.model.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<MenuEntity, Long> {

}