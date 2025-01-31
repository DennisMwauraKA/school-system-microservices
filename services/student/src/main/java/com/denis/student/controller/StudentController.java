package com.denis.student.controller;


import com.denis.student.dtos.CreateStudentDto;
import com.denis.student.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {
    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<Integer> createStudent(@RequestBody @Valid CreateStudentDto studentDto) {
        return ResponseEntity.ok(service.createStudent(studentDto));
    }
}
