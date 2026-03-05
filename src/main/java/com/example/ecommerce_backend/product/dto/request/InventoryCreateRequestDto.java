package com.example.ecommerce_backend.product.dto.request;

import jakarta.validation.constraints.NotNull;

public record InventoryCreateRequestDto(

        Long productId,

        @NotNull(message = "Quantity can not be empty")
        Integer quantityAvailable

) {
}
