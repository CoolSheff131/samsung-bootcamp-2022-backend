package com.coolsheff.repository;

import com.coolsheff.domain.Tag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TagRepository  extends JpaRepository<Tag, Integer> {
}
