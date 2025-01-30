package com.denis.students.studentMapper;

import com.denis.students.dtos.CreateStudentDto;
import com.denis.students.model.Student;
import org.springframework.stereotype.Service;

@Service
public class Mapper {
    public Student toCreateStudent(CreateStudentDto studentDto) {

        return Student.builder()
                .id(studentDto.getId())
                .firstname(studentDto.getFirstname())
                .lastname(studentDto.getLastname())
                .email(studentDto.getEmail())
                .schoolId(studentDto.getSchoolId())
                .build();
    }
}
