package com.example.ecommerce_backend.product.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductResponseDto {

    private String name;
    private String description;
    private String sku;
    private Double price;
    private String imageUrl;
    private Boolean isActive;
    private Long category_id;
}