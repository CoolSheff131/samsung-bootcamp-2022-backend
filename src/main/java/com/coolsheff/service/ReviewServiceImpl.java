package com.coolsheff.service;

import com.coolsheff.domain.Review;
import com.coolsheff.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewServiceImpl  implements ReviewService{

    private final ReviewRepository reviewRepository;

    @Override
    public Review insert(Review entity) {
        return reviewRepository.save(entity);
    }

    @Override
    public List<Review> getAll() {

        return reviewRepository.findAll();
    }

    @Override
    public Review getById(int id) {
        return reviewRepository.findById(id).get();
    }

    @Override
    public Review update(int id, String titleReview, String content) {//TODO добавить теги
        Review entity = Review.builder().id(id).title(titleReview).content(content).build();
        return reviewRepository.save(entity);
    }

    @Override
    public void deletedById(int id) {
        reviewRepository.deleteById(id);
    }
}
