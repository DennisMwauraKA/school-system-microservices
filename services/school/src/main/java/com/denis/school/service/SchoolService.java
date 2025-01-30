package com.denis.school.service;

import com.denis.school.dao.SchoolRepository;
import com.denis.school.dtos.CreateSchoolDto;
import com.denis.school.schoolMapper.Mapper;
import org.springframework.stereotype.Service;

@Service
public class SchoolService {
    private final SchoolRepository repository;
    private final Mapper mapper;

    public SchoolService(SchoolRepository repository, Mapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    // create a school
    public Integer createSchool(CreateSchoolDto schoolDto) {
        try {
            var school = mapper.toCreateSchool(schoolDto);
            return repository.save(school).getId();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
