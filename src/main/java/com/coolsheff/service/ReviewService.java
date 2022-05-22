package com.coolsheff.service;

import com.coolsheff.domain.Review;

import java.util.List;

public interface ReviewService {
    Review insert(Review entity);

    List<Review> getAll();

    Review getById(int id);

    Review update(int id, String titleReview, String content);

    void deletedById(int id);
}
