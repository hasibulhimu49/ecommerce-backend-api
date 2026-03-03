package com.example.ecommerce_backend.product.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ProductCreateRequestDto(
        @NotBlank(message = "Name can not be blank")
        @Size(max = 200, message = "Name cannot exceed 200 characters")
        String name,

        @Size(max = 500, message = "Description cannot exceed 500 characters")
        String description,

        @NotBlank(message = "SKU cannot be blank")
        @Size(max = 100, message = "SKU cannot exceed 100 characters")
        String sku,

        @NotNull(message = "Price is required")
        Double price,

        @Size(max = 250, message = "Image URL cannot exceed 250 characters")
        String imageUrl,

        Boolean isActive,

        Long category_id
) {}