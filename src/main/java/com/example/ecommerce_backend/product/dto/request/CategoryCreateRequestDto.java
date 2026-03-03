package com.example.ecommerce_backend.product.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoryCreateRequestDto(
        @NotBlank(message = "Name can not be null")
        String name,

        @Size(max = 20)
        String code,

        Boolean isActive
) {
}
