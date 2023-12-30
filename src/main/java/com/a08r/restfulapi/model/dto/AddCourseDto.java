package com.a08r.restfulapi.model.dto;



import lombok.*;

import java.math.BigDecimal;


@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddCourseDto {

    private String title;

    private String description;

    private BigDecimal price;

//    public AddCourseDto() {
//    }
//
//    public AddCourseDto(String title, String description, BigDecimal price) {
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
