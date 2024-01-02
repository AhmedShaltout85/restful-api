package com.a08r.restfulapi.model.mapper;

import com.a08r.restfulapi.model.dto.AddCourseDto;
import com.a08r.restfulapi.model.dto.CourseDto;
import com.a08r.restfulapi.model.course.Course;


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
        CourseDto  courseDto = new CourseDto(course);
        return courseDto;
    }



}
