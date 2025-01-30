package com.denis.students.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudentDto {
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String schoolId;
}
