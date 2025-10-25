package com.steve.spring_web_demo.service;

import com.steve.spring_web_demo.dto.ProductDTO;
import com.steve.spring_web_demo.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> productList = new ArrayList<>();

    public ProductDTO addProduct(ProductDTO productDTO) {
        productList.add(mapDtoToEntity(productDTO));
        return productDTO;
    }

    public List<ProductDTO> getAllProducts() {
        List<ProductDTO> productDTOList = new ArrayList<>();
        for (Product product : productList) {
            productDTOList.add(mapEntityToDto(product));
        }
        return productDTOList;
    }

    private Product mapDtoToEntity(ProductDTO productDTO) {
        String name = productDTO.getName();
        String description = productDTO.getDescription();
        Double unitPrice = productDTO.getUnitPrice();
        Integer stockQuantity = productDTO.getStockQuantity();
        Long id = (long) productList.size();

        return new Product(id, name, description, unitPrice, stockQuantity);
    }

    private ProductDTO mapEntityToDto(Product product) {
        String name = product.getName();
        String description = product.getDescription();
        Double unitPrice = product.getUnitPrice();
        Integer stockQuantity = product.getStockQuantity();

        return new ProductDTO(name, description, unitPrice, stockQuantity);
    }
}
