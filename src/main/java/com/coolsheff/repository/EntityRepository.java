package com.coolsheff.repository;

import com.coolsheff.dao.Entity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntityRepository extends JpaRepository<Entity, Integer> {

    Entity findByName(String name);
}
