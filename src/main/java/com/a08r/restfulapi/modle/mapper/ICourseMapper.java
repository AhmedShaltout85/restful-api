package com.a08r.restfulapi.model.mapper;

import com.a08r.restfulapi.model.dto.AddCourseDto;
import com.a08r.restfulapi.model.dto.CourseDto;
import com.a08r.restfulapi.model.course.Course;

public interface ICourseMapper {
    Course  addCourseDtoToCourse(AddCourseDto addCourseDto);
    CourseDto courseToCourseDto(Course course);
}
