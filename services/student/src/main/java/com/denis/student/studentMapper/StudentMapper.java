package com.denis.student.studentMapper;


import com.denis.student.dtos.CreateStudentDto;
import com.denis.student.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {
    public Student toCreateStudent(CreateStudentDto studentDto) {

        return Student.builder()
                .id(studentDto.getId())
                .firstName(studentDto.getFirstName())
                .lastName(studentDto.getLastName())
                .email(studentDto.getEmail())
                .build();
    }
}
