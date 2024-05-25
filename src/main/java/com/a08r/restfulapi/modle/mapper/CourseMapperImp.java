package com.a08r.restfulapi.modle.mapper;

import com.a08r.restfulapi.modle.dto.AddCourseDto;
import com.a08r.restfulapi.modle.dto.CourseDto;
import com.a08r.restfulapi.modle.course.Course;


public class CourseMapperImp implements ICourseMapper{
    @Override
    public Course addCourseDtoToCourse(AddCourseDto addCourseDto) {
        Course course = new Course();
        course.setTitle(addCourseDto.getTitle());
        course.setDescription(addCourseDto.getDescription());
        course.setPrice(addCourseDto.getPrice());

        return course;
    }

    @Override
    public CourseDto courseToCourseDto(Course course) {
        return new CourseDto(course);
    }



}
