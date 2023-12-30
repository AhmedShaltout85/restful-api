package com.a08r.restfulapi.service;

import com.a08r.restfulapi.model.dto.AddCourseDto;
import com.a08r.restfulapi.model.dto.CourseDto;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface ICourseService {
    ResponseEntity<List<CourseDto>> findAll();
    ResponseEntity<CourseDto> findById(Long id);
    ResponseEntity<CourseDto> create(AddCourseDto addCourseDto);
    ResponseEntity<CourseDto> update(Long id, AddCourseDto addCourseDto);
    ResponseEntity<String> remove(Long id);

}
