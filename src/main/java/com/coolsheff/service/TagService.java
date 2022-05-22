package com.coolsheff.service;

import com.coolsheff.domain.Review;
import com.coolsheff.domain.Tag;

import java.util.List;

public interface TagService {
    Tag insert(Tag entity);

    List<Tag> getAll();

    Tag getById(int id);

    Tag update(int id, String nameTag);

    void deletedById(int id);
}
