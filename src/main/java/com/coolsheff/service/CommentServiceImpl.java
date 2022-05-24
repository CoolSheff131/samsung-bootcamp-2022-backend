package com.coolsheff.service;

import com.coolsheff.domain.Comment;
import com.coolsheff.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CommentServiceImpl implements CommentService{

    private final CommentRepository commentRepository;
    @Override
    public Comment insert(Comment comment) {
        return commentRepository.save(comment);
    }

    @Override
    public List<Comment> getAll() {

        return commentRepository.findAll();
    }



    @Override
    public List<Comment> getByReviewId(int id) {
        return commentRepository.findByReviewId(id);
    }

    @Override
    public Comment update(int id, String content) {
        return commentRepository.save(Comment.builder()
                .id(id)
                .content(content)
                .build());
    }

    @Override
    public void deletedById(int id) {
        commentRepository.deleteById(id);
    }
}
