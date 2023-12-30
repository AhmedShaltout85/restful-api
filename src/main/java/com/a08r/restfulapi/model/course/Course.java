package com.a08r.restfulapi.model.course;

import com.a08r.restfulapi.model.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.*;


import java.math.BigDecimal;

@Entity
@Table(name = "courses")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Course extends BaseEntity {
    @NotBlank(message = "Title is mandatory")
    @Column(name = "title")
    private String title;
    @NotBlank(message = "Description is mandatory")
    @Column(name = "description")
    private String description;
    @NotBlank(message = "Price is mandatory")
    @Column(name = "price")
    private BigDecimal price;

//    public Course() {
//    }
//
//    public Course(String title, String description, BigDecimal price) {
//        this.title = title;
//        this.description = description;
//        this.price = price;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public BigDecimal getPrice() {
//        return price;
//    }
//
//    public void setPrice(BigDecimal price) {
//        this.price = price;
//    }

}
