package com.coolsheff.service;

import com.coolsheff.domain.Comment;
import com.coolsheff.domain.Review;

import java.util.List;

public interface CommentService {
    Comment insert(Comment comment);

    List<Comment> getAll();


    List<Comment> getByReviewId(int id);

    Comment update(int id, String content);

    void deletedById(int id);
}
