package com.a08r.restfulapi.modle.dto;



import lombok.*;

import java.math.BigDecimal;

@Builder
@Setter
@Getter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddCourseDto {

    private String title;

    private String description;

    private BigDecimal price;

}
