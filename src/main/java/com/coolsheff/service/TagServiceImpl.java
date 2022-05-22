package com.coolsheff.service;

import com.coolsheff.domain.Tag;
import com.coolsheff.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TagServiceImpl implements TagService{

    private final TagRepository tagRepository;

    @Override
    public Tag insert(Tag entity) {
        return tagRepository.save(entity);
    }

    @Override
    public List<Tag> getAll() {
        return tagRepository.findAll();
    }

    @Override
    public Tag getById(int id) {
        return tagRepository.findById(id).get();
    }

    @Override
    public Tag update(int id, String nameTag) {
        return tagRepository.save(Tag.builder()
                .id(id)
                .name(nameTag)
                .build());
    }

    @Override
    public void deletedById(int id) {
        tagRepository.deleteById(id);
    }
}
