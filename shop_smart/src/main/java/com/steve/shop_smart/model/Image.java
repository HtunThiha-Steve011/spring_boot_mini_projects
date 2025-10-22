package com.steve.shop_smart.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "image")
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "url", unique = true, nullable = false)
    private String url;

    @Column(name = "caption")
    private String caption;

    @Column(name = "main_image", nullable = false)
    private Boolean isMain;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
