package com.coolsheff.service;

import com.coolsheff.domain.StudyType;
import com.coolsheff.domain.Tag;
import com.coolsheff.repository.StudyTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudyTypeServiceImpl implements StudyTypeService{

    private final StudyTypeRepository studyTypeRepository;

    @Override
    public StudyType insert(StudyType entity) {
        return studyTypeRepository.save(entity);
    }

    @Override
    public List<StudyType> getAll() {
        return studyTypeRepository.findAll();
    }

    @Override
    public StudyType getById(int id) {
        return studyTypeRepository.findById(id).get();
    }

    @Override
    public StudyType update(int id, String nameStudyType) {
        return studyTypeRepository.save(StudyType.builder()
                .id(id)
                .type(nameStudyType)
                .build());
    }

    @Override
    public void deletedById(int id) {
        studyTypeRepository.deleteById(id);
    }
}
