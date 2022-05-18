package com.coolsheff.rest.controller;

import com.coolsheff.rest.dto.EntityDto;
import com.coolsheff.service.EntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class EntityController {
    private final EntityService entityService;

    @GetMapping("/entity")
    public List<EntityDto> getAllEntity(){
        return entityService.getAll().stream().map(EntityDto::toDto).collect(Collectors.toList());
    }
}
