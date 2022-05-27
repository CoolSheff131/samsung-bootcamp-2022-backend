package com.coolsheff.rest.dto;

import com.coolsheff.domain.Comment;
import com.coolsheff.domain.Review;
import com.coolsheff.domain.Tag;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TagDto {

    private int id;
    private String name;

//    public static Tag toDomainObject(TagDto tagDto) {
//        return new Tag(tagDto.getId(), tagDto.getName(),null);
//    }

//    public static TagDto toDto(Tag tag) {
//        System.out.println("AAAAAAAAAAAAAAAAaaa");
//        return new TagDto(tag.getId(), tag.getName());
//    }
}
