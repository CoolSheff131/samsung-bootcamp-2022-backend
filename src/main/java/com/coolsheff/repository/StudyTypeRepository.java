package com.coolsheff.repository;

import com.coolsheff.domain.StudyType;
import com.coolsheff.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudyTypeRepository extends JpaRepository<StudyType, Integer> {
}
