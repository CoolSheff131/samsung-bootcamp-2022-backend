package com.coolsheff.repository;

import com.coolsheff.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository  extends JpaRepository<Review, Integer> {
}
