package com.coolsheff.service;

import com.coolsheff.dao.Entity;
import com.coolsheff.repository.EntityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EntityServiceImpl implements EntityService{

    private final EntityRepository entityRepository;
    @Override
    public Entity insert(Entity entity) {
        return entityRepository.save(entity);
    }

    @Override
    public List<Entity> getAll() {
        return entityRepository.findAll();
    }

    @Override
    public Entity getById(int id) {
        return entityRepository.findById(id).get();
    }

    @Override
    public Entity getByName(String name) {
        return entityRepository.findByName(name);
    }

    @Override
    public Entity update(int id, String nameEntity) {
        Entity entity = Entity.builder().id(id).name(nameEntity).build();

        return entityRepository.save(entity);
    }

    @Override
    public void deletedById(int id) {
        entityRepository.deleteById(id);
    }
}
