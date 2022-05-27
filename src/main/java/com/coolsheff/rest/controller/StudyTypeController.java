package com.coolsheff.rest.controller;

import com.coolsheff.domain.StudyType;
import com.coolsheff.service.StudyTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class StudyTypeController {
    private final StudyTypeService studyTypeService;

    @GetMapping("/studyType")
    public List<StudyType> getAllEntity(){
        return studyTypeService.getAll();
    }
}
