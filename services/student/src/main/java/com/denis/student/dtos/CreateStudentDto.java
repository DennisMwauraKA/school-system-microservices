package com.denis.student.dtos;

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
    private String firstName;
    private String lastName;
    private String email;

}
