package com.denis.students.service;

import com.denis.students.dao.StudentRepository;
import com.denis.students.dtos.CreateStudentDto;
import com.denis.students.studentMapper.Mapper;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository repository;
    private final Mapper mapper;

    public StudentService(StudentRepository repository, Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    // create a student
    public Integer createStudent(CreateStudentDto studentDto) {
        var student = mapper.toCreateStudent(studentDto);
        return repository.save(student).getId();
    }
}
