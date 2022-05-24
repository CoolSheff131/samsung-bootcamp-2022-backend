package com.coolsheff.rest.dto;

import com.coolsheff.domain.Comment;
import com.coolsheff.domain.Review;
import com.coolsheff.domain.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
    //private Set<Tag> tagDtoList;

    public static ReviewDto toDto(Review review){
        List<CommentDto> commentDtoList;
        if (review.getComments() != null) {
            commentDtoList = review.getComments().stream().map(CommentDto::toDto).collect(Collectors.toList());
        } else {
            commentDtoList = new ArrayList<>();
        }
//        Set<TagDto> tagDtoSet;
//        System.out.println("test1");
//        tagDtoSet = new HashSet<>();
//        if(review.getTags() != null){
//
//            var a = review.getTags();
//            System.out.println(a.size());
//            for (var s: a
//                 ) {
//                System.out.println(s);
//                tagDtoSet.add(TagDto.toDto(s));
//            }
//            //tagDtoSet = a.stream().map(TagDto::toDto).collect(Collectors.toSet());
//            System.out.println("test3");
//        }else{
//            System.out.println("test4");
//
//        }
        System.out.println("test5");
        return new ReviewDto(
                review.getId(),
                review.getTitle(),
                review.getContent(),
                review.getUploadDate(),
                commentDtoList

        );
    }

    public static Review toDomainObject(ReviewDto entityDto, List<Comment> comments, Set<Tag> tags){
        return new Review(
                entityDto.getId(),
                entityDto.getTitle(),
                entityDto.getContent(),
                entityDto.getUploadDate(),
                comments,
                tags
        );
    }
}
