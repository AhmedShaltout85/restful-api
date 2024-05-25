package com.a08r.restfulapi.modle.mapper;

import com.a08r.restfulapi.modle.dto.AddCourseDto;
import com.a08r.restfulapi.modle.dto.CourseDto;
import com.a08r.restfulapi.modle.course.Course;

public interface ICourseMapper {
    Course  addCourseDtoToCourse(AddCourseDto addCourseDto);
    CourseDto courseToCourseDto(Course course);
}
