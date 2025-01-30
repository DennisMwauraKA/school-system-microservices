package com.denis.school.schoolMapper;

import com.denis.school.dtos.CreateSchoolDto;
import com.denis.school.model.School;
import org.springframework.stereotype.Service;

@Service
public class Mapper {
    public School toCreateSchool(CreateSchoolDto schoolDto) {

        return School.builder()
                .id(schoolDto.getId())
                .name(schoolDto.getName())
                .email(schoolDto.getEmail())
                .build();
    }
}
