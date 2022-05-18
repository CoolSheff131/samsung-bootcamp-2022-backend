package com.coolsheff.service;

import com.coolsheff.dao.Entity;

import java.util.List;

public interface EntityService {

    Entity insert(Entity entity);

    List<Entity> getAll();

    Entity getById(int id);

    Entity getByName(String name);

    Entity update(int id, String nameEntity);

    void deletedById(int id);
}
