package com.denis.student.service;


import com.denis.student.dao.StudentRepository;
import com.denis.student.dtos.CreateStudentDto;
import com.denis.student.studentMapper.StudentMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    private final StudentRepository repository;
    private final StudentMapper mapper;

    public StudentService(StudentRepository repository, StudentMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    // create a student
    public Integer createStudent(CreateStudentDto studentDto) {
        try {
            var student = mapper.toCreateStudent(studentDto);
          return  repository.save(student).getId();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
