package com.a08r.restfulapi.controller;
import com.a08r.restfulapi.model.dto.AddCourseDto;
import com.a08r.restfulapi.model.dto.CourseDto;
import com.a08r.restfulapi.service.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/course")
public class CourseController {

    private  final ICourseService iCourseService;
    @Autowired
    public CourseController(ICourseService iCourseService) {
        this.iCourseService = iCourseService;
    }

    @GetMapping
    public ResponseEntity<List<CourseDto>> getAll(){
     return this.iCourseService.findAll();
    }

    @GetMapping(path ="/{courseId}" )
    public ResponseEntity<CourseDto> findByCourseById(@PathVariable Long courseId){
        return this.iCourseService.findById(courseId);

    }
    @PostMapping
    public ResponseEntity<CourseDto> createCourse(@RequestBody AddCourseDto addCourseDto){
        return this.iCourseService.create(addCourseDto);
    }

    @PutMapping(path = "/{courseId}")
    public ResponseEntity<CourseDto> updateCourse(@PathVariable Long courseId, @RequestBody AddCourseDto addCourseDto){
        return this.iCourseService.update(courseId, addCourseDto);
    }
    @DeleteMapping(path = "/{courseId}")
    public ResponseEntity<String> deleteCourse(@PathVariable Long courseId){
        return this.iCourseService.remove(courseId);
    }

}
