package com.coolsheff.rest.dto;

import com.coolsheff.domain.Comment;
import com.coolsheff.domain.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentDto {

    private int id;

    private String content;

    public static Comment toDomainObject(CommentDto commentDto, Review review) {
        return new Comment(commentDto.getId(), commentDto.getContent(), review);
    }

    public static CommentDto toDto(Comment comment) {
        return new CommentDto(comment.getId(), comment.getContent());
    }
}
