package com.coolsheff.rest.controller;

import com.coolsheff.rest.dto.ReviewDto;
import com.coolsheff.rest.dto.TagDto;
import com.coolsheff.service.ReviewService;
import com.coolsheff.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class TagController {
    private final TagService tagService;

    @GetMapping("/tag")
    public List<TagDto> getAllEntity(){
        return tagService.getAll().stream().map(TagDto::toDto).collect(Collectors.toList());
    }
}
