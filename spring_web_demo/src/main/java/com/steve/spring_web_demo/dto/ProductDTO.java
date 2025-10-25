package com.steve.spring_web_demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class ProductDTO {
    private String name;
    private String description;
    private Double unitPrice;
    private Integer stockQuantity;
}
