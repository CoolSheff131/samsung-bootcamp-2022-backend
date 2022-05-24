package com.coolsheff.rest.controller;

import com.coolsheff.rest.dto.CommentDto;
import com.coolsheff.rest.dto.ReviewDto;
import com.coolsheff.rest.dto.TagDto;
import com.coolsheff.service.CommentService;
import com.coolsheff.service.ReviewService;
import com.coolsheff.service.TagService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @GetMapping("/comment")
    public List<CommentDto> getAllEntity(){
        return commentService.getAll().stream().map(CommentDto::toDto).collect(Collectors.toList());
    }
}
