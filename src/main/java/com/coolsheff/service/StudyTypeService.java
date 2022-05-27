package com.coolsheff.service;

import com.coolsheff.domain.StudyType;
import com.coolsheff.domain.Tag;

import java.util.List;

public interface StudyTypeService {
    StudyType insert(StudyType entity);

    List<StudyType> getAll();

    StudyType getById(int id);

    StudyType update(int id, String nameType);

    void deletedById(int id);
}
