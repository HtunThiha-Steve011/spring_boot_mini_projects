package com.steve.spring_web_demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Product {
    private Long id;
    private String name;
    private String description;
    private Double unitPrice;
    private Integer stockQuantity;
}
