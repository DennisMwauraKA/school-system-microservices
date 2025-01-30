package com.denis.school.controller;

import com.denis.school.dtos.CreateSchoolDto;
import com.denis.school.service.SchoolService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/schools")
public class SchoolController {
    private final SchoolService service;

    public SchoolController(SchoolService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Integer> createStudent(@RequestBody @Valid CreateSchoolDto schoolDto) {
        return ResponseEntity.ok(service.createSchool(schoolDto));
    }
}
