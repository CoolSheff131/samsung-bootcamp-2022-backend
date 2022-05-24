package com.coolsheff.rest.controller;

import com.coolsheff.domain.Review;
import com.coolsheff.rest.dto.ReviewDto;
import com.coolsheff.service.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ReviewController {
    private final ReviewService reviewService;

    @GetMapping("/review")
    public List<ReviewDto> getAllEntity(){
        return reviewService.getAll().stream().map(ReviewDto::toDto).collect(Collectors.toList());
    }

    @GetMapping("/rev")
    public ReviewDto getReivew(){

        var a =reviewService.getById(1);

        return ReviewDto.toDto(a);
    }
}
