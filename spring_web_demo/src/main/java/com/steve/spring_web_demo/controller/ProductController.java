package com.steve.spring_web_demo.controller;

import com.steve.spring_web_demo.dto.ProductDTO;
import com.steve.spring_web_demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public ResponseEntity<ProductDTO> addProduct(@RequestBody ProductDTO productDTO) {
        productService.addProduct(productDTO);
        return ResponseEntity.status(201).body(productDTO);
    }

    @GetMapping("/list")
    public ResponseEntity<List<ProductDTO>> getAllProducts() {
        List<ProductDTO> resultList = productService.getAllProducts();
        return ResponseEntity.status(200).body(resultList);
    }
}
