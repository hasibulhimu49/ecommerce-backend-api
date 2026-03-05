package com.example.ecommerce_backend.product.dto.update;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record CategoryUpdateRequestDto(
        String name,

        @Size(max = 20)
        String code,

        Boolean isActive
) {
}
