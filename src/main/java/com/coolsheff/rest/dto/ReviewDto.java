package com.coolsheff.rest.dto;

import com.coolsheff.domain.Comment;
import com.coolsheff.domain.Review;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReviewDto {
    private int id;

    private String title;

    private String content;

    private String uploadDate;

    private List<CommentDto> commentDtoList;

    public static ReviewDto toDto(Review review){
        List<CommentDto> commentDtoList;
        if (review.getComments() != null) {
            commentDtoList = review.getComments().stream().map(CommentDto::toDto).collect(Collectors.toList());
        } else {
            commentDtoList = new ArrayList<>();
        }
        return new ReviewDto(
                review.getId(),
                review.getTitle(),
                review.getContent(),
                review.getUploadDate(),
                commentDtoList
        );
    }

    public static Review toDomainObject(ReviewDto entityDto, List<Comment> comments){
        return new Review(
                entityDto.getId(),
                entityDto.getTitle(),
                entityDto.getContent(),
                entityDto.getUploadDate(),
                comments
        );
    }
}
