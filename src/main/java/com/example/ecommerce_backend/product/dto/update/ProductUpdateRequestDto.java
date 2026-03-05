package com.example.ecommerce_backend.product.dto.update;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public record ProductUpdateRequestDto(

        @Size(max = 200, message = "Name cannot exceed 200 characters")
        String name,

        @Size(max = 500, message = "Description cannot exceed 500 characters")
        String description,

        String sku,
        Double price,
        String imageUrl,
        Boolean isActive,

        Long category_id
) {
}
