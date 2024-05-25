package com.a08r.restfulapi.modle.dto;


import com.a08r.restfulapi.modle.course.Course;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CourseDto {
   private final Course course;

    public CourseDto(Course course) {

        this.course = course;
    }

  public String getTitle(){

        return this.course.getTitle();
  }
  public String getDescription(){

        return this.course.getDescription();
  }
  public BigDecimal getPrice(){

        return this.course.getPrice().setScale(2, RoundingMode.HALF_UP);
  }

}
